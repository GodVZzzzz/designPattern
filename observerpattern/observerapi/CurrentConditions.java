package designpattern.observerpattern.observerapi;

import designpattern.observerpattern.makeobserver.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description
 */
public class CurrentConditions implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditions(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof Weather){
            Weather weather = (Weather) obs;
            this.temperature = weather.getTemperature();
            this.humidity = weather.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions: "+temperature+"F degrees and "+ humidity+"% humidity" );
    }
}
