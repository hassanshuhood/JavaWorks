public class Cat extends Animal implements Pet{

    public Cat(){
        super("abcd");
        System.out.println("inside cat constructor");
    }
    public void makeSound(){
        System.out.println("Cat moise");
    }

    public void catPersonal(){
        System.out.println("Cat personal");
    }

    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        System.out.println("Cat friend");

    }
}
