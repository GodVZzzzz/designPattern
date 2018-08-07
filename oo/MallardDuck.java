package designmodel.oo;

/**
 * @author Zhang
 * @date 2018/8/6
 * @Description
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
