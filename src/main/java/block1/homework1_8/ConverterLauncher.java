package block1.homework1_8;

import java.util.Scanner;

public class ConverterLauncher {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double degree = getDegree();
        String conversion = getConversion();
        double result = conversion(degree, conversion);
        System.out.println("==> "+ result);
    }
    public static double getDegree() {
        System.out.println("Enter a degree: ");
        double degree;
        if (in.hasNextDouble()) {
            degree = in.nextDouble();
        } else {
            System.out.println("Input error! Try again!");
            in.next();
            degree = getDegree();
        }
        return degree;
    }
    public static String getConversion() {
        System.out.println("Convert to: " +
                "\nCK --> Celsius to Kelvin" +
                "\nKC --> Kelvin to Celsius" +
                "\nCF --> Celsius to Fahrenheit" +
                "\nFC --> Fahrenheit to Celsius" +
                "\nKF --> Kelvin to Fahrenheit" +
                "\nFK --> Fahrenheit to Kelvin");
        return in.nextLine();
    }
    public static double conversion(double deg, String conv){
        double res;
        switch (conv){
            case "FK":
                res = Converter.getConverter(Degrees.F_K).convert(deg);
                break;
            case "KF":
                res = Converter.getConverter(Degrees.K_F).convert(deg);
                break;
            case "CK":
                res = Converter.getConverter(Degrees.C_K).convert(deg);
                break;
            case "KC":
                res = Converter.getConverter(Degrees.K_C).convert(deg);
                break;
            case "CF":
                res = Converter.getConverter(Degrees.C_F).convert(deg);
                break;
            case "FC":
                res = Converter.getConverter(Degrees.F_C).convert(deg);
                break;
            default:
                System.out.println("Input error! Try again!");
                res = conversion(deg, getConversion());
                break;
        }
        return res;
    }
}