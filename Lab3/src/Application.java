import Model.Professor;
import Model.Student;
import Service.StorageService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String op;

        while(true) {
            System.out.println("Enter command: ");

            op = scanner.nextLine();

            switch(op) {
                case "create":
                    StorageService.create();
                    break;
                case "read":
                    StorageService.read();
                    break;
                case "update":
                    StorageService.update();
                    break;
                case "delete":
                    StorageService.delete();
                    break;
                case "quit":
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command. Please try again");
                    break;
            }
        }

    }
}
