// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        testSummation();
        testMultiplication();
    }

    public static void testSummation(){
        System.out.println("Summation test: ");
        Matrix matrix1 = new Matrix(2, 3);
        // set up the new matrix
        matrix1.setUpMatrix();
        // print the matrix
        matrix1.printMatrix();
        // make a new matrix
        Matrix matrix2 = new Matrix(2, 3);
        // set up the new matrix
        matrix2.setUpMatrix();
        // print the matrix
        matrix2.printMatrix();

        // add the two matrices together
        matrix1.addMatrix(matrix2);
        // print the matrix
        matrix1.printMatrix();
    }
    public static void testMultiplication(){
        System.out.println("Multiplication test: ");
        Matrix matrix2 = new Matrix(2, 3);
        // set up the new matrix
        matrix2.setUpMatrix();
        // print the matrix
        matrix2.printMatrix();
        // make a new matrix
        Matrix matrix3 = new Matrix(3, 2);
        // set up the new matrix
        matrix3.setUpMatrix();
        // print the matrix
        matrix3.printMatrix();

        // multiply the two matrices together
        matrix2.multiplyMatrix(matrix3);
        // print the matrix
        matrix2.printMatrix();
    }
}