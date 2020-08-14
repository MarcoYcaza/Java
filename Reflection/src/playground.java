import java.lang.reflect.Constructor;

public class playground {
    public static void main(String[] args) {
        //Dog dog1 =  new Dog("CC");

        //dog1.bark();

        // Obtener un objeto tipo java.lang.Class, no es el objeto tipo Dog

        /*Class<Dog> adn = Dog.class;

        System.out.println(adn.getMethods()[0]);
        System.out.println(adn.getMethods()[1]);
        System.out.println(adn.getMethods()[2]);*/

        //System.out.println(adn.getClass());
        /*try{
            Constructor<Dog> constructor1 = Dog.class.getConstructor(String.class);

            Dog dog4 = constructor1.newInstance("CC2");

            dog4.eating();
        }catch (Exception e){
            e.printStackTrace();
        }*/

        //Class<Dog> dogADN = Dog.class;

        DogCreator CesarMilan = new DogCreator();

        Dog MyDog =CesarMilan.createDog(Dog.class,"La CC");

        MyDog.bark();
    }
}
