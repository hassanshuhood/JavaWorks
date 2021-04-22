package work.src.designPatterns.observerPattern.builtIn;

public class Harnes {
    public static void main(String[] args) {

        WeatherData wd = new WeatherData();
        CurrentConditionsDisplay disp1 = new CurrentConditionsDisplay(wd);

        wd.setMeasurements(12, 33, 44);

        wd.setMeasurements(12, 33, 44);

        wd.setMeasurements(12, 33, 44);
    }
}
