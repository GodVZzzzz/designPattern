package designpattern.compoundpattern.cooperation;

/**
 * @author Zhang
 * @date 2018/8/15
 * @Description
 */
public interface QuackObservable {

    public void registerObserver(Observer observer);
    public void notifyObservers();
}
