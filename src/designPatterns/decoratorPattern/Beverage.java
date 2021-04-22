package designPatterns.decoratorPattern;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public void setDescription(String d){
        description = d;
    }
    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}