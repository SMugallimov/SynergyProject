package homework16.part1;

public class Employee {
    private String name;
    private int workAge;

    public Employee (String name, int workAge){
        this.name = name;
        this.workAge = workAge;
    }

    public String getName() {
        return name;
    }

    public int getWorkAge() {
        return workAge;
    }
}
