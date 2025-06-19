public class SingletonTest {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        if (log1 == log2) {
            System.out.println("Logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }

        log1.log("Hello from first logger");
        log2.log("Hello again from second ref");
    }
}