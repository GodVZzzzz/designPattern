package designpattern.factorypattern.factorymethodpattern;

/**
 * @author Zhang
 * @date 2018/8/11
 * @Description
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A person ordered a "+pizza.getName()+"\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("A person ordered a "+pizza.getName());
    }
}
