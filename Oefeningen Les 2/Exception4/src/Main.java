
public class Main {
    public static void main(String[] args) {
        try {
            //define an object reference and initialize it to null
            Object ref = null;
            //Try to call a method through this reference
            ref.toString();
        } catch (Exception e) {
            System.out.println("Caught NullPointerException");
        }

    }
}