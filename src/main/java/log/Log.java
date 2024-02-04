package log;
import org.apache.log4j.Logger;
public class Log {
    public static void info(String message,Throwable t) {
        Log.info(message,t);
    }
    public static void info(int message,Throwable t) {
        Log.info(message,t);
    }

    public static void info(String message) {
        Log.info(message,null);
    }
    public static void info(int message) {
        Log.info(String.valueOf(message),null);
    }

    public static void warn(String message,Throwable t) {
        Log.warn(message,t);
    }

    public static void error(String message,Throwable t) {
        Log.error(message,t);
    }

    public static void fatal(String message,Throwable t) {
        Log.fatal(message,t);
    }

    public static void debug(String message,Throwable t) {
        Log.debug(message,t);
    }

    public static void debug(String message) {
        Log.debug(message);
    }
}
