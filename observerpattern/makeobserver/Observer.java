package designpattern.observerpattern.makeobserver;

/**
 * @author Zhang
 * @date 2018/8/7
 * @Description Observer模式
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
