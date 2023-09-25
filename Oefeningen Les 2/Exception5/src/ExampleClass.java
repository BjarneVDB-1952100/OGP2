public class ExampleClass {
    public void f() throws Exception {
        try {
            g();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            throw new YourException("This is another exception");
        }
    }
    private void g() throws Exception{
        throw new MyException("This is an exception");
    }
}
