
public class Main {
    public static void main(String[] args) {
        findPrimes(40);
    }
    public static void findPrimes(int maxNumber){
        for(int i = 2; i <= maxNumber; i++){
            boolean isPrime = true;
            for(int j = 2; j <= i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}