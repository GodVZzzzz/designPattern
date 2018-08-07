package designmodel.oo;

/**
 * @author Zhang
 * @date 2018/8/6
 * @Description
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
