package homework2;

import java.util.Scanner;

public class BasicCalculator {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char oper = getOperations();
        double result = calculation(num1, num2, oper);
        System.out.println("==>> " + result);
    }
    public static double getNumber() {
        System.out.println("Enter a number: ");
        double num;
        if (in.hasNextDouble()) {
            num = in.nextDouble();
        } else {
            System.out.println("Input error! Try again!");
            in.next();
            num = getNumber();
        }
        return num;
    }
    public static char getOperations() {
        System.out.println("Enter a operation: ");
        char chr;
        if (in.hasNext()) {
            chr = in.next().charAt(0);
        } else {
            System.out.println("Input error! Try again!");
            in.next();
            chr = getOperations();
        }
        return chr;
    }
    public static double calculation(double num1, double num2, char oper) {
        double calc = 0.0D;
        switch(oper) {
            case '*':
                calc = num1 * num2;
                break;
            case '+':
                calc = num1 + num2;
                break;
            case '-':
                calc = num1 - num2;
                break;
            case '/':
                calc = num1 / num2;
            default:
                System.out.println("Input error! Try again!");
                calc = calculation(num1, num2, getOperations());
                break;
        }
        return calc;
    }
}
