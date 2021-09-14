package block4.homework4_1;


import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCreatorRunner {
    @SneakyThrows
    public static void main(String[] args) {

        FileCreator fileCreator = new FileCreator("E:/file.txt");

        for(int i = 0; i < 4; i++) {
            fileCreator.writeFile();
            Thread.sleep(5000);
        }
        fileCreator.fileWriterClose();

        createNewFile();

    }
    @SneakyThrows
    public static void createNewFile(){
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