package homework15;

import java.util.Collection;

public class Employee {
    private String fio;
    private int workAge;

    public Employee(String fio, int workAge){
        this.fio = fio;
        this.workAge = workAge;
    }

    public String getFio() {
        return fio;
    }

    public int getWorkAge() {
        return workAge;
    }
}