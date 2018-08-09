package designpattern.decorator.mydecorator;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description 浓缩咖啡
 */
public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
