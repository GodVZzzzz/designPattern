package designpattern.compoundpattern.cooperation;

/**
 * @author Zhang
 * @date 2018/8/15
 * @Description
 */
public class RubberDuck implements Quackable {

    Observable observable;

    public RubberDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
