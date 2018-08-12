package designpattern.adapterpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
