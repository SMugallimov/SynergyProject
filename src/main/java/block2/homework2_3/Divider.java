package block2.homework2_3;

public class Divider {
    public int division(int num1, int num2){
        int result = 0;
        try {
            result = num1 / num2;
        }
        catch (ArithmeticException exp){
            System.out.println(exp.getMessage());
        }
        return result;
    }
}