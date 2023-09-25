public class MyExceptionExample extends Exception{
    private String message;
    public MyExceptionExample(String message) {
        super(message);
        this.message = message;
    }
}
