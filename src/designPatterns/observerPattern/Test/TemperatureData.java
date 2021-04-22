package work.src.designPatterns.observerPattern.Test;

import java.util.ArrayList;

public class TemperatureData implements Subject{

    ArrayList<ObserverInterface> observerList = new ArrayList<ObserverInterface>();
    int temperature = 0;

    public void setTemp(int t){
        this.temperature = t;
        notifyObservers();
    }

    @Override
    public void addObserver(ObserverInterface o) {
        observerList.add(o);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeObserver(ObserverInterface o) {
        // TODO Auto-generated method stub
        int index = observerList.indexOf(o);
        if (index > -1)
        observerList.remove(o);

        
    }

    
    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub

        for(ObserverInterface o : observerList){
            o.update(this);
        }
        
    }
    
}
