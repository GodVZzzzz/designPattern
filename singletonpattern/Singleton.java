package designpattern.singletonpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }
}
