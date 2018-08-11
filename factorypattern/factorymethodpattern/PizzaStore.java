package designpattern.factorypattern.factorymethodpattern;

/**
 * @author Zhang
 * @date 2018/8/11
 * @Description
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza= createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
