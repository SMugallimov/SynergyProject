package homework4;

import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Fibonacci element or Exit");
            if (in.hasNext("Exit") || in.hasNext("exit")) {
                System.out.println("End of program.");
                System.exit(0);
            }
            int fibElement = in.nextInt();
            int fibLength = fibElement + 1;
            int[] fibArray = new int[fibLength];
            fibArray[0] = 1;
            fibArray[1] = 1;
            for (int i = 2; i < fibArray.length; i++) {
                fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
            }
            System.out.println("Fibonacci line:");
            for (int i = 0; i < fibArray.length; i++) {
                System.out.print(fibArray[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < fibArray.length; i++) {
                if (fibElement == i) {
                    System.out.println("The selected element is " + fibArray[i] + " in Fibonacci line");
                }
            }
            System.out.println("Enter Fibonacci element or Exit");
            if (in.hasNext("Exit") || in.hasNext("exit")) {
                System.out.println("End of program.");
                System.exit(0);
            }
            fibElement = in.nextInt();
            if(fibElement <= fibLength){
                for(int i = 0; i < fibArray.length; i++){
                    if (fibElement == i) {
                        System.out.println("The selected element is " + fibArray[i] + " in Fibonacci line");
                    }
                }
            }
            else{
                int newFibLength = fibElement;
                int[] newFibArray = new int[newFibLength];
                newFibArray[0] = fibArray[fibArray.length-2];
                newFibArray[1] = fibArray[fibArray.length-1];
                for(int i = 2; i < newFibArray.length; i++){
                    newFibArray[i] = newFibArray[i - 1] + newFibArray[i - 2];
                }
                System.out.println("Fibonacci line:");
                for (int i = 0; i < newFibArray.length; i++) {
                    System.out.print(newFibArray[i] + " ");
                }
                System.out.println();
                for(int i = 0; i < fibArray.length; i++){
                    if (fibElement == i) {
                        System.out.println("The selected element is " + fibArray[i] + " in Fibonacci line");
                    }
                }
            }
        }
    }
}