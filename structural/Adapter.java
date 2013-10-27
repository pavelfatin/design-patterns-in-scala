public interface Log {
    void warning(String message);
    void error(String message);
}

public final class Logger {
    void log(Level level, String message) { /* ... */ }
}

public class LoggerToLogAdapter implements Log {
    private final Logger logger;

    public LoggerToLogAdapter(Logger logger) { this.logger = logger; }

    public void warning(String message) {
        logger.log(WARNING, message);
    }
    
    public void error(String message) {
        logger.log(ERROR, message);
    }
}

Log log = new LoggerToLogAdapter(new Logger());
