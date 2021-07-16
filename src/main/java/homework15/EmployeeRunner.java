package homework15;

import java.util.*;

public class EmployeeRunner {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        int qtyEmployees = 15;
        int workAges;
        int workAge = 0;

        Random rnd = new Random();
        for(int i = 1; i <= qtyEmployees; i++){
            workAges = rnd.nextInt(30)+1;
            employees.add(new Employee("#" + i + " Employee - Work Age: ", workAges));
        }
        for(Iterator<Employee> employeeIterator = employees.iterator(); employeeIterator.hasNext();){
            Employee newEmpl = employeeIterator.next();
            System.out.println(newEmpl.getFio() + newEmpl.getWorkAge());
        }
        System.out.println();

        workAge = adviseWorkAge();

        printEmployee(employees, workAge);

        System.out.println();

        ListIterator<Employee> employeeListIterator = employees.listIterator();
        while (employeeListIterator.hasNext()){
            employeeListIterator.next();
        }
        for(int i = 0; employeeListIterator.hasPrevious(); i++){
            Employee reverseEmployee = employeeListIterator.previous();
            if(i % 2 != 0) {
                System.out.println(reverseEmployee.getFio() + reverseEmployee.getWorkAge());
            }
        }
    }
    public static void printEmployee(Collection<Employee> employees, int workAge){
        for(Iterator<Employee> employeeIterator = employees.iterator(); employeeIterator.hasNext();){
            Employee newEmpl = employeeIterator.next();
            if(workAge == newEmpl.getWorkAge()) {
                System.out.println(newEmpl.getFio() + newEmpl.getWorkAge());
            }
        }
    }
    public static int adviseWorkAge(){
        System.out.println("Advise work age: ");
        int num;
        if (in.hasNextInt()) {
            num = in.nextInt();
        } else {
            System.out.println("Input error! Try again!");
            in.next();
            num = adviseWorkAge();
        }
        return num;
    }
}