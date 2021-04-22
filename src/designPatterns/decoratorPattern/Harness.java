package designPatterns.decoratorPattern;

import designPatterns.decoratorPattern.decorator.BaseDecorator;
import designPatterns.decoratorPattern.decorator.CreamDecorator;

public class Harness {
    public static void main(String[] args) {
        
        Beverage b1 = new Tea();
        System.out.println(b1.getDescription() + " " + b1.getCost()); 
        Beverage b2 = new Coffee();
        System.out.println(b2.getDescription() + " " + b2.getCost()); 

        Beverage b3 = new CreamDecorator(b1) ;
        System.out.println(b3.getDescription() + " " + b3.getCost()); 

    }
}
