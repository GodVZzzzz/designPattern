package designmodel.observermodel.observerapi;

/**
 * @author Zhang
 * @date 2018/8/7
 * @Description
 */
public class ObserverTest {
    public static void main(String[] args) {
        Weather weather = new Weather();

        CurrentConditions currentConditions = new CurrentConditions(weather);

        weather.setMeasurements(80,65,30.4f);
        weather.setMeasurements(82,70,29.2f);
        weather.setMeasurements(78,90,29.2f);
    }


}
