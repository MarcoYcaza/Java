import java.lang.reflect.Constructor;

public class DogCreator {

    public Dog createDog(Class<Dog> dogADN , String name){

        try{
            Constructor<Dog> dogConstructor = Dog.class.getConstructor(String.class);
            //  Dog dogCreated =  (Dog) dogConstructor.newInstance(name);
            return (Dog) dogConstructor.newInstance(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

}
