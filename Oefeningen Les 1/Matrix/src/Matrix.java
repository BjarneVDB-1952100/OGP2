public class Matrix {
    private int rows;
    private int cols;

    private int [][] matrix;

    public Matrix(int rows, int cols){
        this.cols = cols;
        this.rows = rows;
        this.matrix = new int[rows][cols];
    }

    public void setUpMatrix(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                //set each item in the matrix to a random integer from 1-10
                this.matrix[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void printMatrix(){
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] addMatrix(Matrix matrix){
        if(this.rows != matrix.getRows() || this.cols != matrix.getCols()){
            System.out.println("The matrices are not the same size!");
            return null;
        }
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                this.matrix[i][j] += matrix.getMatrix()[i][j];
            }
        }
        return this.matrix;
    }
    public int[][] multiplyMatrix(Matrix matrix){
        if(this.cols != matrix.getRows()){
            System.out.println("The matrices are not the correct size!");
            return null;
        }
        int [][] newMatrix = new int[this.rows][matrix.getCols()];
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < matrix.getCols(); j++){
                int sum = 0;
                for(int k = 0; k < this.cols; k++){
                    sum += this.matrix[i][k] * matrix.getMatrix()[k][j];
                }
                newMatrix[i][j] = sum;
            }
        }
        this.matrix = newMatrix;
        this.cols = matrix.getCols();
        return this.matrix;
    }
}
