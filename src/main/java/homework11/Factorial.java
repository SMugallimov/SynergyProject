package homework11;

public class Factorial {
    public int getFactorial(int num){
        int result = 1;
        if(num < 1) throw new IllegalArgumentException("The number is less than 1.");
        for(int i = 1; i <= num; i++){
            result *=i;
        }
        return result;
    }
}