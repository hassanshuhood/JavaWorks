package work.src.designPatterns.observerPattern.Test;

public class Display1 implements ObserverInterface{

    @Override
    public void update(TemperatureData t) {
       System.out.println("Temperature updated to =" + t.temperature);
        
    }
    
}
