package block3.homework3_7;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.*;
import java.util.Date;

enum LogLevel {
    ERROR,
    INFO,
    WARN,
    DEBUG,
    TRACE
}
@RequiredArgsConstructor
public class Logger {

    private FileWriter fileWriter;

    @SneakyThrows
    public Logger(String logFilePath) {
        this.fileWriter = new FileWriter("E:/log.txt", true);
    }
    @SneakyThrows
    public void writeLog(LogLevel logLvl, String logMsg) {
        Date date = new Date();
        this.fileWriter.write(date + " " + Thread.currentThread().getId() + " " + logLvl + " " + logMsg + '\n');
    }
    @SneakyThrows
    public void closeLog() {
        this.fileWriter.close();
    }
}