package homework16;

import java.util.Comparator;

public class EmployeeWorkAgeComparator implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2){
        if(employee1.getWorkAge() > employee2.getWorkAge()){
            return -1;
        }
        else if(employee1.getWorkAge() < employee2.getWorkAge()){
            return 1;
        }
        else
            return 0;
    }
}
