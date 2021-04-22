package designPatterns.decoratorPattern;

public class Coffee extends Beverage{

    public Coffee(){
        setDescription("Coffee");
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 20;
    }
    
}
