import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

// Followed https://www.baeldung.com/java-logging-intro

public class Logging_Log4j2 {

    private static Logger logger = LogManager.getLogger(Logging_Log4j2.class);

    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}