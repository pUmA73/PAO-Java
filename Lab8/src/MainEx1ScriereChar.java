import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainEx1ScriereChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean runLoop = true;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("persoaneChar.txt", true))) {
            while (runLoop) {
                try {
                    System.out.println("Nume:");
                    String nume = scanner.nextLine();

                    System.out.println("Prenume:");
                    String prenume = scanner.nextLine();

                    System.out.println("Varsta:");
                    int varsta = Integer.parseInt(scanner.nextLine());

                    System.out.println("Suma:");
                    double suma = Double.parseDouble(scanner.nextLine());

                    System.out.println("Valuta:");
                    String valuta = scanner.nextLine();

                    if (suma > 2000) {
                        throw new LargeSumException("Suma introdusa este mai mare de 2000.");
                    }

                    String record = nume + "; " + prenume + "; " + varsta + "; " + suma + "; " + valuta + "; " + "\n";
                    writer.write(record);
                    writer.flush();

                    System.out.println("Mai introduceti o persoana? (da/nu)");
                    String answer = scanner.nextLine();
                    if (!answer.equalsIgnoreCase("da")) {
                        runLoop = false;
                    }
                } catch (LargeSumException e) {
                    System.out.println(e.getMessage());
                    // Reluam ciclul de introducere a datelor
                }
            }
        } catch (IOException e) {
            System.out.println("A aparut o eroare la scrierea in fisier: " + e.getMessage());
        }
    }

    static class LargeSumException extends Exception {
        public LargeSumException(String message) {
            super(message);
        }
    }
}
