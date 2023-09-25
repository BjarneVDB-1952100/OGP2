
public class Main {

    public static void main(String[] args) {
        try{
            throw new Exception("Error thrown correctly");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Finally");
        }
    }
}