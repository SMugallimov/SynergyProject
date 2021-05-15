package homework3;

import java.util.Scanner;

public class SquareRootOfNumber {
    static Scanner in = new Scanner((System.in));
    public static void main(String[] args) {
        int num = getNumber();
        System.out.println(sqrn(num));

    }
    public static int getNumber(){
        int number;
        System.out.println("Enter number: ");
        if(in.hasNextInt()){
            number = in.nextInt();
        }
        else{
            System.out.println("Input error. Try again.");
            in.hasNextInt();
            number = getNumber();
        }
        return number;
    }
    public static int sqrn(int n){
        int result = 0;
        int counter = 0;
        for(int i = 1; i <= n; i++){
            if(i * i == n){
                result = i;
            }
        }
        return result;
    }
}
