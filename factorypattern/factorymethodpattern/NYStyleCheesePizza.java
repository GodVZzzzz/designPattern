package designpattern.factorypattern.factorymethodpattern;

/**
 * @author Zhang
 * @date 2018/8/10
 * @Description
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY style sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
