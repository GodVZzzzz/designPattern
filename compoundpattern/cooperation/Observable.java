package designpattern.compoundpattern.cooperation;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Zhang
 * @date 2018/8/15
 * @Description
 */
public class Observable implements QuackObservable {

    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
