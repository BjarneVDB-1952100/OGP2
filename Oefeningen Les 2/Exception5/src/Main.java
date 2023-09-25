
public class Main {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        try {
            exampleClass.f();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}