package designpattern.singletonpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class Singleton1 {
    private volatile static Singleton1 uniqueInstance;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton1.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton1();
                }
            }
        }
        return uniqueInstance;
    }
}
