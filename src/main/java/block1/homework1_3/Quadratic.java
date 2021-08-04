package block1.homework1_3;

import java.util.Scanner;

public class Quadratic {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double coef1 = getCoefficient();
        while(coef1 == 0) {
            System.out.println("First coefficient can't be zero! Enter other number!");
            coef1 = getCoefficient();
        }
        double coef2 = getCoefficient();
        double coef3 = getCoefficient();
        System.out.println(calculation(coef1, coef2, coef3));
    }
    public static double getCoefficient() {
        System.out.println("Enter coefficient: ");
        double num;
        if (in.hasNextDouble()) {
            num = in.nextDouble();
        } else {
            System.out.println("Input error! Try again!");
            in.next();
            num = getCoefficient();
        }
        return num;
    }
    public static String calculation(double a, double b, double c) {
        String result = "";
        double d = Math.pow(b,2) - 4 * a * c;
        String x1;
        if (d > 0.0) {
            x1 = Double.toString((-b + Math.sqrt(d)) / (2 * a));
            String x2 = Double.toString((-b - Math.sqrt(d)) / (2 * a));
            result = "x1 = " + x1 + "; x2 = " + x2;
        } else if (d == 0) {
            x1 = Double.toString((-b + Math.sqrt(d)) / (2 * a));
            result = "x = " + x1;
        } else {
            System.out.println("No valid solutions!");
        }
        return result;
    }
}
