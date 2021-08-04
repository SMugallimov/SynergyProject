package block1.homework1_5;

public class MatrixLauncher {
    public static void main(String[] args) {
        System.out.println("Matrix #1:");
        Matrix matrix1 = new Matrix();
        matrix1.fillMatrix();
        matrix1.printMatrix();

        System.out.println("Matrix #2:");
        Matrix matrix2 = new Matrix(4,4);
        matrix2.fillMatrix();
        matrix2.printMatrix();

        Matrix result = new Matrix();
        System.out.println("Addition:");
        result = matrix1.addition(matrix1);
        result.printMatrix();

        System.out.println("Subtraction:");
        result = matrix1.subtraction(matrix2);
        result.printMatrix();

        System.out.println("Multiplication:");
        result = result.multiply(matrix1, matrix2);
        result.printMatrix();

        System.out.println("Static revers with parameters:");
        result = matrix1.reverse(matrix1);
        result.printMatrix();

        System.out.println("Revers w/o parameters:");
        result = matrix1.reverse();
        result.printMatrix();

        System.out.println("Unit matrix:");
        result = matrix2.unitMatrix(4);
        result.printMatrix();

        System.out.println("Multiply on number:");
        result = matrix2.matrixMultiOnNumber(matrix2, 4);
        result.printMatrix();

        System.out.println("Power of matrix:");
        result = matrix1.powMatrix(matrix1, 2);
        result.printMatrix();
    }
}