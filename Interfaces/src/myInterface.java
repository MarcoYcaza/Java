/*Like abstract classes, interfaces cannot be used to create objects
(in the example above, it is not possible to create an "Animal" object in the MyMainClass)
        Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
        Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)*/

public interface myInterface {

    /*
    *  You can embed a variable
    *  You can create and instanciate a nested class (note its going to be static and final by default)
    *  Declare some muted methods.
    * */

    String myVariable1 = "Interface say : Hello World";
    myExtrangeClass  myVirus = new myExtrangeClass();

    void action1();
    void action2();
    void action3();

    class myExtrangeClass{
        public void action4(int valor1 , int valor2){
            System.out.println("La suma es: "+(valor1+valor2));
        }
    }

}
