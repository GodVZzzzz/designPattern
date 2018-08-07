package designmodel.observermodel.makeobserver;

/**
 * @author Zhang
 * @date 2018/8/7
 * @Description Subject接口
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
