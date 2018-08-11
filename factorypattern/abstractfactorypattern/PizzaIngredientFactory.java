package designpattern.factorypattern.abstractfactorypattern;

/**
 * @author Zhang
 * @date 2018/8/11
 * @Description
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
}
