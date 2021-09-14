package block4.homework4_1;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.FileWriter;
import java.util.Date;

@RequiredArgsConstructor
public class FileCreator {

    private FileWriter fileWriter;

    @SneakyThrows
    public FileCreator(String filePath){
        this.fileWriter = new FileWriter(filePath, true);
    }
    @SneakyThrows
    public void writeFile(){
        Date currentDate = new Date();
        this.fileWriter.write("Current date: " + currentDate + '\n');
    }

    @SneakyThrows
    public void fileWriterClose(){
        this.fileWriter.close();
    }
}