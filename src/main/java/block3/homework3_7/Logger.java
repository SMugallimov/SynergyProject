package block3.homework3_7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Logger {

    private String textMessage;
    private String loggingLevel;

    public Logger(String textMessage, String loggingLevel){
        this.textMessage = textMessage;
        this.loggingLevel = loggingLevel;

    }
    public void logToFile () throws IOException {

        try(FileOutputStream fileOutputStream = new FileOutputStream("E:/log.txt")) {

            Date dateNow = new Date();
            String dateNowBuffer = dateNow.toString();
            fileOutputStream.write(dateNowBuffer.getBytes());
            fileOutputStream.write(this.textMessage.getBytes());
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}