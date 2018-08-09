package designpattern.decorator.mydecorator;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description 饮料类
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
