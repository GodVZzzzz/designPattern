package designpattern.observerpattern.observerapi;

import java.util.Observable;

/**
 * @author Zhang
 * @date 2018/8/7
 * @Description
 */
public class Weather extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public Weather(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
}
