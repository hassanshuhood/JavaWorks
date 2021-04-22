package work.src.designPatterns.separateChanges;

import work.src.designPatterns.separateChanges.fly.FlyBehaviour;
import work.src.designPatterns.separateChanges.fly.FlyNoWay;
import work.src.designPatterns.separateChanges.fly.FlyWithWings;

public class RubberDuck extends Duck{
    // dont fly
    //dont quack
    public RubberDuck(){
        super.f = new FlyNoWay();
    }
}
