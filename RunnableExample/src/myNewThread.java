import com.sun.istack.internal.logging.Logger;
import sun.util.logging.PlatformLogger;

import java.util.logging.Level;

public class myNewThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            //Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

}
