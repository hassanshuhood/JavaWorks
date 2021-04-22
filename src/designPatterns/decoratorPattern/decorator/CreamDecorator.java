package designPatterns.decoratorPattern.decorator;

import designPatterns.decoratorPattern.Beverage;

public class CreamDecorator extends BaseDecorator{
    Beverage bev;

    public CreamDecorator(Beverage b) {
        bev = b;
        //TODO Auto-generated constructor stub
    }

    public double getCost(){
        return 5 + bev.getCost();
    }


    
}
