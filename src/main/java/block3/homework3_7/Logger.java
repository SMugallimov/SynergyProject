package block3.homework3_7;

import lombok.RequiredArgsConstructor;

import java.io.*;
import java.util.Date;

@RequiredArgsConstructor
public class Logger {
    private String logMsg;
    private String logLvl;

    public void writeToFile(String logLvl) {
        try(FileWriter fileWriter = new FileWriter("E:/log.txt", true)){
        Date date = new Date();
        switch (logLvl) {
            case "ERROR":
                fileWriter.write(date + " " + logLvl + " Communication error\n");
                break;
            case "INFO":
                fileWriter.write(date + " " + logLvl + " Successfully connected to EIS Simulator\n");
                break;
            case "WARN":
                fileWriter.write(date + " " + logLvl + " Memory leakage" + '\n');
            case "DEBUG":
                fileWriter.write(date + " " + logLvl + " Check your variables. Create breakpoint\n");
                break;
            case "TRACE":
                fileWriter.write(date + " " + logLvl + " While attempting to close the connection to EIS Simulator,\n" +
                        "EISS API reported that the server had already closed the connection\n" +
                        "previously due to inactivity. Ignoring because connection was closed all the same\n");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFromFile(){
        String text;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("E:/log.txt"))){

            while ((text = bufferedReader.readLine()) != null){
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}