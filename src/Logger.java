public class Logger {
    protected int num = 1;

    private static Logger logger = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return logger;
    }

    public void log(String msg) {
        // TODO add datetime to log
        System.out.println("[" + num++ + "] " + msg);
    }
}// class