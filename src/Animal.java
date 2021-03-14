import java.util.Random;



public class Animal {

    public static int animalDefaultName;
    public static final int TEST;
    static{
        TEST = 1;

    }

    public final int test2 = 67;


    private static Animal a = new Animal("test");

    public Animal getAnimal(){
        return a;

    }

    public Animal(String name){
        System.out.println(" inside animal constructor");
    }

    public void makeSound(){
        System.out.println("Animal moise");
    }

    public static Pet checkPet(){
        Pet p = null;

        int random = (int) (Math.random() * 10 % 2);
        System.out.println(random);
        if(random == 1)
            p = new Dog();
        else
            p = new Cat();    
        return p;    
    }
 }