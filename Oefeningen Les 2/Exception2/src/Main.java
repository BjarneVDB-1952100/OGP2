
public class Main {
    public static void main(String[] args) {
        try {
            throw new MyExceptionExample("This is my exception");
        } catch (MyExceptionExample e) {
            System.out.println(e.getMessage());
        }
    }
}