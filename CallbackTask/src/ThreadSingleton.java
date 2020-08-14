import java.io.File;
import java.util.ArrayList;


public class ThreadSingleton extends Thread {

    private static ArrayList<myEventListener> mListeners = null;

    private static final ThreadSingleton myOnlyThread = new ThreadSingleton();

    private ThreadSingleton(){}


    public  static ThreadSingleton getInstance(ArrayList<myEventListener> temp){
        mListeners = temp;
        return myOnlyThread;
    }


    @Override
    public void run() {
        super.run();

        /*try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        if(mListeners != null){
            boolean token = true;
            while(token){
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
                        token = false;
                    }

                }
            }


        }

    }

    @Override
    public void interrupt() {
        super.interrupt();
    }
}
