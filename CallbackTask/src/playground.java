//import java.io.File;
import java.util.*;

public class playground {

    private ArrayList<myEventListener> mListeners;

    public void registerMyListeners(ArrayList<myEventListener> mListeners) {
        this.mListeners = mListeners;
    }

    private void checkingMyInnerDirectory() {
        /*Thread myThread = new Thread(() -> {
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
        });

        myThread.start();*/

        ThreadSingleton mysingleton = ThreadSingleton.getInstance(mListeners);
        mysingleton.start();

    }

    public static void main(String[] args) {
        ArrayList<myEventListener> observers_List = new ArrayList<>();

        myEventListener mListener1 = new myObserver();
        myEventListener mListener2 = new myObserver2();
        myEventListener mListener3 = new myObserver3();

        observers_List.add(mListener1);
        observers_List.add(mListener2);
        observers_List.add(mListener3);

        playground play = new playground();

        play.registerMyListeners(observers_List);

        // ANSYNCRONUS TASKS

        play.checkingMyInnerDirectory();

        // ANOTHER TASKS ON THE MAIN FUNCTION

        System.out.println("(Process ongoing in background)");
        System.out.println("Press enter to end the process:");

        Scanner readinput = new Scanner(System.in);

        String enterkey = readinput.nextLine();

        if (enterkey.equals("")) {System.out.println("It works!");}

    }
}
