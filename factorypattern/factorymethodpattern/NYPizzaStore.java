package designpattern.factorypattern.factorymethodpattern;

/**
 * @author Zhang
 * @date 2018/8/11
 * @Description
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
