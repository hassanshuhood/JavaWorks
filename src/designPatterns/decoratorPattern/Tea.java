package designPatterns.decoratorPattern;

public class Tea extends Beverage{
    
    public Tea(){
        setDescription("Tea");
    }
    
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 10;
    }
    
}
