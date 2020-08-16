/*Like abstract classes, interfaces cannot be used to create objects
(in the example above, it is not possible to create an "Animal" object in the MyMainClass)
        Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
        Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)*/

public interface myInterface {

    /*So an interface can have methods and variables*/

    public String myVariable1 = "Interface say : Hello World";

    public void action1();
    public void action2();
    public void action3();
}
