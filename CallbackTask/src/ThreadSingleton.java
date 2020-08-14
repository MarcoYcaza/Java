import java.io.File;
import java.util.ArrayList;
import java.util.*;

public class ThreadSingleton extends Thread {

    private static ArrayList<myEventListener> mListeners = null;

    private static  ThreadSingleton myOnlyThread = new ThreadSingleton();

    private ThreadSingleton(){}


    public  static ThreadSingleton getInstance(ArrayList<myEventListener> temp){
        mListeners = temp;
        return myOnlyThread;
    }

    @Override
    public synchronized void start() {
        super.start();

    }

    @Override
    public void run() {
        super.run();

        if(mListeners != null){
            //System.out.println("Working Directory = " + System.getProperty("user.dir"));
            File file = new File(System.getProperty("user.dir"));
            String[] fileList = file.list();
            assert fileList != null;
            for(String name:fileList){
                // System.out.println(name);

                if (name.equals("archivo1.txt")){
                    for (myEventListener e:mListeners){
                        e.reportingSomeStuff();
                    }

                }
            }

        }

    }


}
