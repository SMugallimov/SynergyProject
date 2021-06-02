package homework11;

import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void WriteToFile() {
        try {
            FileWriter fileWriter = new FileWriter("out.txt");
            fileWriter.write("Hello All!!");
            fileWriter.close();
            fileWriter.write("Bye All!!");
        } catch (IOException exp) {
            System.out.println("Error! - impossible to write into closed file.");
        }
        System.out.println("The program is continue working.");
    }
}