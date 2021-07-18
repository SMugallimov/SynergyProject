package homework16.part1;

import homework16.part1.Employee;

import java.util.Comparator;

public class EmployeeWorkAgeComparator implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2){

        return employee2.getWorkAge() - employee1.getWorkAge();
    }
}
