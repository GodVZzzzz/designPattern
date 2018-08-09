package designpattern.decorator.mydecorator;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description 装饰者"奶泡"
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescriotion() {
        return beverage.getDescription()+", Whip";
    }

    public double cost(){
        return .10+beverage.cost();
    }
}
