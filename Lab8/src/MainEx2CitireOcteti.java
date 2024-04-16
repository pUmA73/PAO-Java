import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class MainEx2CitireOcteti {

    public static void main(String[] args) {

        String fileName = "persoaneOcteti.txt";
        List<Person> persoane = new ArrayList<>();

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                try {
                    Person persoana = (Person) objectInputStream.readObject();
                    persoane.add(persoana);
                } catch (IOException e) {
                    // End of stream
                    break;
                } catch (ClassNotFoundException e) {
                    System.out.println("Class not found: " + e.getMessage());
                    return;
                }
            }
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fisier: " + e.getMessage());
            return;
        }

        for (int i = 0; i < persoane.size(); ++i) {
            String numePrenume = persoane.get(i).getLastName() + " " + persoane.get(i).getFirstName();
            boolean duplicate = false;

            for (int j = 0; j < persoane.size(); ++j) {
                if (i != j) {
                    String numePrenume2 = persoane.get(j).getLastName() + " " + persoane.get(j).getFirstName();
                    if (numePrenume2.equals(numePrenume)) {
                        duplicate = true;
                        break;
                    }
                }
            }

            if (duplicate) {
                System.out.println("Persoana: " + numePrenume + " -> " + persoane.get(i));
            }
        }
    }
}
