package homework11;

public class Factorial {
    public int getFactorial(int num){
        int result = 1;
        try{
            if(num < 1) throw new Exception("The number is less than 1.");
            for(int i = 1; i <= num; i++){
                result *=i;
            }
        }
        catch (Exception exp){
            System.out.println(exp.getMessage());
            result = num;
        }
        return result;
    }
}