package work.src.designPatterns.observerPattern.Test;

public interface Subject {
    
    public void addObserver(ObserverInterface o );
    public void removeObserver(ObserverInterface o);
    public void notifyObservers( );
}
