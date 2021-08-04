package block1.homework1_5;

public class Matrix {
    private int rowLength;
    private int colLength;
    private int[][] array;

    public int getRowLength() {
        return rowLength;
    }
    public int getColLength() {
        return colLength;
    }

    public Matrix(){
        this.rowLength = 2;
        this.colLength = 2;
        this.array = new int[rowLength][colLength];
    }

    public Matrix(int rowLength, int colLength){
        this.rowLength = rowLength;
        this.colLength = colLength;
        this.array = new int[rowLength][colLength];
    }

    public Matrix addition(Matrix matrix){
        if(getRowLength() != getColLength()){
            return null;
        }
        Matrix result = new Matrix(getRowLength(), getColLength());
        for(int i = 0; i < result.getRowLength(); i++){
            for(int j = 0; j < result.getColLength(); j++){
                result.array[i][j] = this.array[i][j] + matrix.array[i][j];
            }
        }
        return result;
    }

    public Matrix subtraction(Matrix matrix){
        if(getRowLength() != getColLength()) {
            return null;
        }
        Matrix result = new Matrix(getRowLength(), getColLength());
        for(int i = 0; i < result.getRowLength(); i++){
            for(int j = 0; j < result.getColLength(); j++){
                result.array[i][j] = this.array[i][j] - matrix.array[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix matrix1, Matrix matrix2){
        Matrix result = new Matrix(matrix1.getRowLength(), matrix2.getColLength());
        for(int i = 0; i < matrix1.getRowLength(); i++){
            for(int j = 0; j < matrix2.getColLength(); j++){
                for(int k = 0; k < matrix1.getColLength(); k++){
                    result.array[i][j] += matrix1.array[i][k] * matrix2.array[k][j];
                }
            }
        }
        return result;
    }

    public static Matrix reverse(Matrix matrix){
        Matrix result = new Matrix();
        for(int i = 0; i < matrix.getRowLength(); i++){
            for(int j = 0; j < matrix.getColLength(); j++){
                result.array[i][j] = matrix.array[j][i];
            }
        }
        return result;
    }

    public Matrix reverse(){
        Matrix result = new Matrix();
        for(int i = 0; i < result.getRowLength(); i++){
            for(int j = 0; j < result.getColLength(); j++){
                result.array[i][j] = this.array[j][i];
            }
        }
        return result;
    }

    public static Matrix unitMatrix(int size){
        Matrix result = new Matrix(size, size);
        for(int i = 0; i < result.getRowLength(); i++){
            for(int j = 0; j < result.getColLength(); j++){
                if(i == j){
                    result.array[i][j] = 1;
                }
                else{
                    result.array[i][j] = 0;
                }
            }
        }
        return result;
    }

    public Matrix matrixMultiOnNumber(Matrix matrix, int number){
        Matrix result = new Matrix(getRowLength(), getColLength());
        for(int i = 0; i < matrix.getRowLength(); i++){
            for(int j = 0; j < matrix.getColLength(); j++){
                result.array[i][j] = number * matrix.array[i][j];
            }
        }
        return result;
    }

    public Matrix powMatrix(Matrix matrix, int n){
        Matrix result = matrix;
        for(int i = 1; i < n; i++){
            result = multiply(result, matrix);
        }
        return result;
    }

    public void fillMatrix(){
        int[][] array = new int[getRowLength()][getColLength()];
        int counter = 0;
        for(int i = 0; i < getRowLength(); i++){
            for(int j = 0; j < getColLength(); j++){
                this.array[i][j] = counter;
                counter++;
            }
        }
    }

    public void printMatrix(){
        for(int i = 0; i < getRowLength(); i++){
            for(int j = 0; j < getColLength(); j++){
                System.out.printf(" %d", this.array[i][j]);
            }
            System.out.println();
        }
    }
}