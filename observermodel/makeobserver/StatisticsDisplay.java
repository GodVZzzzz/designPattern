package designmodel.observermodel.makeobserver;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Zhang
 * @date 2018/8/7
 * @Description
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList<Float> temperatures;
    private ArrayList<Float> humiditys;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.temperatures = new ArrayList<>();
        this.humiditys = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperatures.add(temperature);
        this.humiditys.add(humidity);
        display();
    }

    public void display(){
        Collections.sort(temperatures);
        Collections.sort(humiditys);

        Float maxTemperature = temperatures.get(temperatures.size()-1);
        Float minTemperature = temperatures.get(0);

        Float maxHumidity = humiditys.get(humiditys.size()-1);
        Float minHumidity = humiditys.get(0);

        Float sumTemp = 0.0f;
        Float sumHum = 0.0f;

        for (Float f : temperatures)
            sumTemp += f;
        for (Float f : humiditys)
            sumHum += f;

        Float aveTemp = sumTemp/temperatures.size();
        Float aveHum = sumHum/humiditys.size();

        System.out.println("Max temperature : "+maxTemperature +"F degrees and max Humidity:"+maxHumidity+
                "% humidity\nMin temperature : "+minTemperature+"F degrees and min humidity : "+
                minHumidity+"% humidity\nAverage Temperature : "+aveTemp+"F degrees and average humidity : "+aveHum+"% humidity");
    }
}
