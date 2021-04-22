package work.src.designPatterns.separateChanges;

import work.src.designPatterns.separateChanges.fly.FlyBehaviour;

public class Duck {
    //it should fly sometime wuack sometime
    FlyBehaviour f;

    // public Duck(FlyBehaviour f){
    //     this.f = f;
    // }
    
    public void setFlyBehaviour(FlyBehaviour fb){
        this.f = fb;
    }

    public void fly(){
        f.fly();
    }

    public void quack(){
        System.out.println("Im quacking");
    }
}
