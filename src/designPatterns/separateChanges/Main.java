package work.src.designPatterns.separateChanges;

public class Main {
    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.fly();
        d = new RubberDuck();
        d.fly();
    }
    
}
