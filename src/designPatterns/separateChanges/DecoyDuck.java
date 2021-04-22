package work.src.designPatterns.separateChanges;

import work.src.designPatterns.separateChanges.fly.FlyBehaviour;
import work.src.designPatterns.separateChanges.fly.FlyNoWay;

public class DecoyDuck extends Duck{

    void DecoyDuck(){
        FlyBehaviour fb = new FlyNoWay();
        super.setFlyBehaviour(fb);
    }
    // dont fly
    //dont quack
}
