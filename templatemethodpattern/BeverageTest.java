package designpattern.templatemethodpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class BeverageTest {

    public static void main(String[] args) {
        CaffeeineBeverageWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }
}
