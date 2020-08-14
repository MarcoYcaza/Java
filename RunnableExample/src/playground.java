public class playground {
    public static void main(String[] args) throws InterruptedException {

        /*Thread myThread = new Thread(()->{
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello");
        });

        myThread.run();*/
        //myThread.start();  //funciona igual

        myNewThread a = new myNewThread();
        a.start();
        System.out.println("finished");
    }
}
