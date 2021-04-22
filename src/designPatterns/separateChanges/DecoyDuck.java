package designPatterns.separateChanges;

import designPatterns.separateChanges.fly.FlyBehaviour;
import designPatterns.separateChanges.fly.FlyNoWay;

public class DecoyDuck extends Duck{

    void DecoyDuck(){
        FlyBehaviour fb = new FlyNoWay();
        super.setFlyBehaviour(fb);
    }
    // dont fly
    //dont quack
}
