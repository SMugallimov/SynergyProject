package block3.homework3_7;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoggerLaunch {
    @SneakyThrows
    public static void main(String[] args) {

        Logger logger = new Logger("E:/log.txt");

        long timeStart = System.currentTimeMillis();
        long endStart = timeStart + 60000L;

        Runnable writeLog1 = () -> {
            while (System.currentTimeMillis() < endStart) {
                logger.writeLog(LogLevel.INFO, "Some logger message");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable writeLog2 = () -> {
            while (System.currentTimeMillis() < endStart) {
                logger.writeLog(LogLevel.ERROR, "Some logger message");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable writeLog3 = () -> {
            while (System.currentTimeMillis() < endStart) {
                logger.writeLog(LogLevel.WARN, "Some logger message");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread th1 = new Thread(writeLog1);
        th1.start();

        Thread th2 = new Thread(writeLog2);
        th2.start();

        Thread th3 = new Thread(writeLog3);
        th3.start();

        th1.join();
        th2.join();
        th3.join();

        logger.closeLog();

        readFromFile();
    }

    public static void readFromFile(){
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