package block4.homework4_1;


import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCreatorRunner {
    public static void main(String[] args) {

        FileCreator fileCreator = new FileCreator("E:/file.txt");

        for(int i = 0; i < 4; i++) {
            fileCreator.writeFile();
        }
        fileCreator.fileWriterClose();

        readFromFile();

    }
    @SneakyThrows
    public static void readFromFile(){
        String text;
        int fileCounter = 1;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("E:/file.txt"))){
            while((text = bufferedReader.readLine()) != null){
                FileWriter newFile = new FileWriter("E:/newFile" + fileCounter + ".txt");
                newFile.write(text);
                newFile.close();
                fileCounter++;
            }
        }
    }
}