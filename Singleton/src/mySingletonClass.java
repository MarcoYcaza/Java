public class mySingletonClass {
    private static mySingletonClass myClass1 = new mySingletonClass();

    private mySingletonClass(){}

    public void saySomething(){
        System.out.println("El tiempo sin ti es empo");
    }

    public static mySingletonClass getInstance(){
        return myClass1;
    }
}
