public class Test {
    public static void main(String[] args) {
        Logger logger1=Logger.getInstance();
        Logger logger2=Logger.getInstance();
        System.out.println(logger1==logger2);
        logger1.log("Hello this is logger1!");
        logger2.log("Hello this is logger2!");
    }
}
