package homework16;

import java.util.*;

public class EmployeeRunner {
    public static void main(String[] args) {
        int employeeCounter = 1;
        int workAges;

        Comparator<Employee> employeeComparator = new EmployeeWorkAgeComparator();
        TreeSet<Employee> employees = new TreeSet(employeeComparator);

        Random rnd = new Random();
        while(employeeCounter <= 15){
            workAges = rnd.nextInt(30) + 1;
            employees.add(new Employee("#" + employeeCounter + " Employee - Work Age: ", workAges));
            employeeCounter++;
        }
        for(Employee employeeList: employees){
            System.out.println(employeeList.getName() + employeeList.getWorkAge());
        }
    }
}