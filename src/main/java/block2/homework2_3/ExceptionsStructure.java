package block2.homework2_3;

public class ExceptionsStructure {
    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException
        Arrays arrays = new Arrays();
        try {
            arrays.printArray(new int[4]);
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("The array out of bounds!");
        }

        //NumberFormatException
        try {
            arrays.printArray(new int[7]);
        } catch (NumberFormatException exp) {
            System.out.println("Error converting from string to number!");
        }

        //IOException
        Files files = new Files();
        files.writeToFile();

        //IllegalArgumentException
        try {
            Ages ages = new Ages();
            ages.getAges(120);
        } catch (IllegalArgumentException exp) {
            System.out.println(exp.getMessage());
        }

        //Throw new IllegalArgumentException
        try {
            Factorial factorial = new Factorial();
            factorial.getFactorial(-1);
        }
        catch (IllegalArgumentException exp){
            System.out.println(exp.getMessage());
        }

        //ArithmeticException
        Divider divider = new Divider();
        divider.division(6, 0);
    }
}