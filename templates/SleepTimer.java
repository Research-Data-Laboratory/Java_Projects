package createfile.templates;
import java.util.concurrent.TimeUnit;
public class SleepTimer {
   public final static void sleepTimer() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}