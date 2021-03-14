public class Main {


    public static void main(String[] args) { 


        System.out.println(Animal.animalDefaultName);
        System.out.println(Animal.d);
        Animal d = new Dog();
        d.makeSound();
        //d.dogPersonal();

        
        Pet p = Animal.checkPet();
        p.beFriendly();

        p = Animal.checkPet();
        p.beFriendly();

        Dog d1 = new Dog();

    }
    
}
