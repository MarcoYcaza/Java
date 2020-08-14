/*
A singleton should be used when managing access to a resource which is shared by the entire application,
and it would be destructive to potentially have multiple instances of the same class. Making sure that
access to shared resources thread safe is one very good example of where this kind of pattern can be vital.

Single Object - I need just one instance of an object in a program
Singleton - create a class with a static field.
Add a static method returning this field.
Lazily instantiate a field on the first call.
Always return the same object.


/
 */

public class playground {
    public static void main(String[] args) {

        mySingletonClass myClass1 = mySingletonClass.getInstance();

        myClass1.saySomething();

        mySingletonClass myClass2 = mySingletonClass.getInstance();

        myClass2.saySomething();

        System.out.println(myClass1.hashCode());
        System.out.println(myClass2.hashCode());

        Dog  dog1 = new Dog();
        Dog  dog2 = new Dog();

        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());

    }
}
