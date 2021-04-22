package work.src.designPatterns.observerPattern.Test;

public class Main {
    
    public static void main(String[] args) {
        TemperatureData td = new TemperatureData();
        Display1 disp1 = new Display1();
        td.addObserver(disp1);
        Display1 disp2 = new Display1();
        td.addObserver(disp2);

        td.setTemp(10);

        td.setTemp(20);
    }
   

}
