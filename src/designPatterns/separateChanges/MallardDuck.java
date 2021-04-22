package work.src.designPatterns.separateChanges;

import work.src.designPatterns.separateChanges.fly.FlyBehaviour;
import work.src.designPatterns.separateChanges.fly.FlyWithWings;

public class MallardDuck extends Duck{
    public MallardDuck(){
        f = new FlyWithWings();
        super.f = f;
    }
}
