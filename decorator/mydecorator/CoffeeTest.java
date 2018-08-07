package designmodel.decorator.mydecorator;

/**
 * @author Zhang
 * @date 2018/8/8
 * @Description 测试
 */
public class CoffeeTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+"$"+beverage1.cost());
    }
}
