package designmodel.decorator.mydecorator;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description 装饰者"摩卡"
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescriotion() {
        return beverage.getDescription()+", Mocha";
    }

    public double cost(){
        return .20+beverage.cost();
    }
}
