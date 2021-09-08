package block3.homework3_7;

import java.util.Random;

public class LoggerLaunch {
    public static void main(String[] args) throws InterruptedException {
        Logger logger1 = new Logger();

        int count = 1;
        while (count != 12) {

            Runnable thread1 = () -> {
                synchronized (logger1) {
                    try {
                        logger1.writeToFile(getLogLevel());
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            Runnable thread2 = () -> {
                synchronized (logger1) {
                    try {
                        logger1.writeToFile(getLogLevel());
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            Runnable thread3 = () -> {
                synchronized (logger1) {
                    try {
                        logger1.writeToFile(getLogLevel());
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            Thread th1 = new Thread(thread1);
            th1.start();
            th1.join();

            Thread th2 = new Thread(thread2);
            th2.start();
            th2.join();

            Thread th3 = new Thread(thread3);
            th3.start();
            th3.join();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }

        //Reading from file
        logger1.readFromFile();
    }
    public static String getLogLevel(){
        Random rnd = new Random();

        int low = 1;
        int high = 5;
        int lgLvl;
        lgLvl = rnd.nextInt(high - low) + low;
        switch (lgLvl){
            case 1:
                return "ERROR";
            case 2:
                return "INFO";
            case 3:
                return "DEBUG";
            case 4:
                return "TRACE";
            case 5:
                return "WARN";
            default:
                throw new IllegalArgumentException("Found unexpected value");
        }
    }
}