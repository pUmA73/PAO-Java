package Service;

import Model.Professor;
import Model.Student;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StorageService {
    private static List<Professor> professors = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void create() {
        System.out.println("Person Type: ");
        String type = scanner.nextLine();

        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Phone Number ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Email Address: ");
        String emailAddress = scanner.nextLine();

        if(type.equals("student")) {
            System.out.println("Student Number: ");
            int studentNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Average Mark: ");
            float avgMark = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("Class: ");
            int cclass = scanner.nextInt();
            scanner.nextLine();

            Student aux = new Student(name, phoneNumber, emailAddress,
                    studentNumber, avgMark, cclass);

            students.add(aux);
        } else if(type.equals("professor")) {
            System.out.println("Course: ");
            String course = scanner.nextLine();

            System.out.println("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Professor aux = new Professor(name, phoneNumber, emailAddress,
                    course, year);

            professors.add(aux);
        }
    }

    public static void read() {
        System.out.println("Name: ");
        String name = scanner.nextLine();

        List<Professor> matchedProfs = professors.stream()
                .filter(professor -> professor.getName().equals(name))
                .collect(Collectors.toList());

        List<Student> matchedStudents = students.stream()
                .filter(student -> student.getName().equals(name))
                .collect(Collectors.toList());

        if(!matchedStudents.isEmpty()) {
            System.out.println("Students: ");
            matchedStudents.forEach(System.out::println);
        }

        if(!matchedProfs.isEmpty()) {
            System.out.println("Professors: ");
            matchedProfs.forEach(System.out::println);
        }
    }

    public static void update() {
        // updatam prima persoana gasita cu numele dat
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Person Type: ");
        String type = scanner.nextLine();

        if(type.equals("professor")) {
            Optional<Professor> matchedProf = professors.stream()
                    .filter(professor -> professor.getName().equals(name))
                    .findFirst();
            if(matchedProf.isPresent()) {
                // daca am gasit un profesor updatam cursul
                System.out.println("Enter the new course: ");
                String course2 = scanner.nextLine();

                matchedProf.get().setCourse(course2);
            } else {
                System.out.println("There are no professors with the given name");
            }
        } else if(type.equals("student")) {
            Optional<Student> matchedStudent = students.stream()
                    .filter(student -> student.getName().equals(name))
                    .findFirst();

            if(matchedStudent.isPresent()) {
                // daca am gasit un student updatam grupa
                System.out.println("Enter the new class: ");
                int class2 = scanner.nextInt();
                scanner.nextLine();

                matchedStudent.get().setCclass(class2);
            } else {
                System.out.println("There are no students with the given name");
            }
        }
    }

    public static void delete() {
        // stergem toti profesorii sau toti studentii cu numele dat
        System.out.println("Name: ");
        String name = scanner.nextLine();

        List<Professor> matchedProfs = professors.stream()
                .filter(professor -> professor.getName().equals(name))
                .collect(Collectors.toList());

        List<Student> matchedStudents = students.stream()
                .filter(student -> student.getName().equals(name))
                .collect(Collectors.toList());

        System.out.println("Person Type: ");

        String type = scanner.nextLine();

        if(type.equals("professor")) {
            if(matchedProfs.isEmpty()) {
                System.out.println("There are no professors with the given name");
            } else {
                professors.removeAll(matchedProfs);
                System.out.println("All professors with the given name were deleted");
            }
        } else if(type.equals("student")) {
            if(matchedStudents.isEmpty()) {
                System.out.println("There are no students with the given name");
            } else {
                students.removeAll(matchedStudents);
                System.out.println("All students with the given name were deleted");
            }
        }

    }
}
