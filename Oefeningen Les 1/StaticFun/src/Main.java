
public class Main {
    public static void main(String[] args) {
        StaticFun sf1 = new StaticFun();
        StaticFun sf2 = new StaticFun();
        System.out.println("sf1.staticTest = " + sf1.staticTest);
        System.out.println("sf2.staticTest = " + sf2.staticTest);
        sf1.incr();
        System.out.println("sf1.staticTest = " + sf1.staticTest);
        System.out.println("sf2.staticTest = " + sf2.staticTest);
        sf2.incr();
        System.out.println("sf1.staticTest = " + sf1.staticTest);
        System.out.println("sf2.staticTest = " + sf2.staticTest);
    }
}