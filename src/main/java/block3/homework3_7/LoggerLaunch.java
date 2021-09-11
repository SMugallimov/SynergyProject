package block3.homework3_7;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LoggerLaunch {
    @SneakyThrows
    public static void main(String[] args) {

        Logger logger = new Logger("E:/log.txt");

//        long timeStart = System.currentTimeMillis();
//        long endStart = timeStart + 60000L;

        Runnable writeLog = () -> {
            synchronized (logger) {
                try {
//                    while(System.currentTimeMillis() < endStart) {
                    for(int i = 0; i < 5; i++){
                        logger.writeLog(getLogSimulation(), "Some logger message");
                        Thread.sleep(5000);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread th1 = new Thread(writeLog);
        th1.start();
        th1.join();

        Thread th2 = new Thread(writeLog);
        th2.start();
        th2.join();

        Thread th3 = new Thread(writeLog);
        th3.start();
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
    public static LogLevel getLogSimulation(){
        Random rnd = new Random();

        int low = 1;
        int high = 5;
        int lgLvl;
        lgLvl = rnd.nextInt(high - low) + low;
        switch (lgLvl){
            case 1:
                return LogLevel.ERROR;
            case 2:
                return LogLevel.INFO;
            case 3:
                return LogLevel.DEBUG;
            case 4:
                return LogLevel.TRACE;
            case 5:
                return LogLevel.WARN;
            default:
                throw new IllegalArgumentException("Found unexpected value");
        }
    }
}