package designPatterns.factorypattern.store;

import designPatterns.factorypattern.pizza.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleCheesePizza();
            // } else if (item.equals("clam")) {
            // return new NYStyleClamPizza();
            // } else if (item.equals("pepperoni")) {
            // return new NYStylePepperoniPizza();
        } else
            return null;
    }
}
