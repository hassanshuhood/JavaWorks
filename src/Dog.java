public class Dog extends Animal implements Pet{
    
    

    public Dog(){
        super("abcd");
        System.out.println("inside Dog constructor");
        //super();
    }
    // public void makeSound(){
    //     System.out.println("Dog moise");
    // }

    public void dogPersonal(){
        System.out.println("Dog personal");
    }

    @Override
    public void beFriendly() {
        // TODO Auto-generated method stub
        System.out.println("Dog friend");

    }
}
