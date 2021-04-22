package work.src.designPatterns.separateChanges.fly;

public class FlyNoWay implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Im not able to Fly");
        
    }
    
}
