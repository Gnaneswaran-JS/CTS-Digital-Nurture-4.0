public class Logger {
    private static Logger obj;

    private Logger() {
    }

    public static Logger getInstance() {
        if (obj == null) {
            synchronized (Logger.class) {
                if (obj == null) {
                    obj = new Logger();
                }
            }
        }
        return obj;
    }

    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}

