import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainEx1CitireChar {

    public static void main(String[] args) {

        String fileName = "persoaneChar.txt";
        List<String> lines = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch(IOException e) {
            System.out.println("Eroare la citirea din fisier: " + e.getMessage());
            return;
        }

        for(int i = 0; i < lines.size(); ++i) {
            String[] data = lines.get(i).split(";");

            if(data.length < 2) continue;
            String numePrenume = data[0] + " " + data[1];
            boolean duplicate = false;

            for(int j = 0; j < lines.size(); ++j) {
                if(i != j) {
                    String[] data2 = lines.get(j).split(";");

                    if(data2.length < 2) continue;
                    String numePrenume2 = data2[0] + " " + data2[1];
                    if(numePrenume2.equals(numePrenume)) {
                        duplicate = true;
                        break;
                    }
                }
            }

            if(duplicate) {
                System.out.println("Persoana: " + numePrenume + " -> " + lines.get(i));
            }
        }

    }

}
