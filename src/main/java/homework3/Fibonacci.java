package homework3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Fibonacci's array length: ");
        int fibLength = in.nextInt();
        int[] nums = new int[fibLength];
        int elem0 = 1;
        int elem1 = 1;
        nums[0] = elem0;
        nums[1] = elem1;
        System.out.print("Fibonacci line: ");
        for(int i = 2; i < nums.length; i++) {
            // nums[i] = nums[i-1] + nums [i - 2] another option without integers elem0 and elem2
            nums[i] = elem0 + elem1;
            elem0 = elem1;
            elem1 = nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("Which Fibonacci element to display? ");
        int element = in.nextInt();
        for(int i = 0; i < nums.length; i++) {
            if (element == i) {
                System.out.println("The selected element in Fibonacci line is: " + nums[i]);
            }
        }
    }
}