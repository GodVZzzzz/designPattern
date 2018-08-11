package designpattern.factorypattern.abstractfactorypattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
    }
}
