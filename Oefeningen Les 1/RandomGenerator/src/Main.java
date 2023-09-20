import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] firstArray = generate25Numbers();
        int[] secondArray = generateAnother25Numbers();
        String[] results = new String[25];
        // compare the two arrays and define if the 1st one is bigger, smaller or equal to the 2nd one
        // print the result
        for(int i = 0; i < firstArray.length; i++){
            if(firstArray[i] > secondArray[i]) {
                results[i] = "First number is bigger";
            } else if(firstArray[i] < secondArray[i]) {
                results[i] = "First number is smaller";
            } else {
                results[i] = "numbers are equal";
            }
        }
        System.out.println(Arrays.toString(results));
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
    }

    public static int[] generate25Numbers(){
        int[] numbers = new int[25];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 10);
        }
        return numbers;
    }

    public static int[] generateAnother25Numbers(){
        int[] numbers = new int[25];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 10);
        }
        return numbers;
    }
}