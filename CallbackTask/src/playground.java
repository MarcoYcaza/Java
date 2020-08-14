import java.io.File;
import java.io.IOException;
import java.util.*;

public class playground {

    private ArrayList<myEventListener> mListeners;

    public void registerMyListeners(ArrayList<myEventListener> mListeners){
        this.mListeners = mListeners;
    }

    private void checkingMyInnerDirectory() throws IOException {
        /*Thread myThread = new Thread(()->{
          if(mListeners != null){
              //System.out.println("Working Directory = " + System.getProperty("user.dir"));
              File file = new File(System.getProperty("user.dir"));
              String[] fileList = file.list();
              assert fileList != null;
              for(String name:fileList){
                 // System.out.println(name);

                  if (name.equals("perrit.txt")){
                      for (myEventListener e:mListeners){
                          e.reportingSomeStuff();
                      }

                  }
              }

          }
        });

        myThread.start();*/

        ThreadSingleton mysingleton = ThreadSingleton.getInstance(mListeners);

        while (System.in.available() == 0){
            mysingleton.run();
        };
    }

    public static void main(String[] args) throws IOException {
        ArrayList<myEventListener> observers_List = new ArrayList<myEventListener>();

        playground play = new playground();

        myEventListener mListener1 = new myObserver();
        myEventListener mListener2 = new myObserver2();
        myEventListener mListener3 = new myObserver3();

        observers_List.add(mListener1);
        observers_List.add(mListener2);
        observers_List.add(mListener3);

        play.registerMyListeners(observers_List);

        play.checkingMyInnerDirectory();
    }

}
