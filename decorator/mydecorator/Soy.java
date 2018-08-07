package designmodel.decorator.mydecorator;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description 装饰者"豆子"
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescriotion() {
        return beverage.getDescription()+", Mocha";
    }

    public double cost(){
        return .15 + beverage.cost();
    }
}
