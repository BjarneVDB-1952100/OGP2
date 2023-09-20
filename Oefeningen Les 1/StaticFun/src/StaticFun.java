public class StaticFun {
    static int staticTest = 0;
    StaticFun() {
        staticTest = 1;
    }
    static void incr() {
        staticTest += 1;
    }
}
