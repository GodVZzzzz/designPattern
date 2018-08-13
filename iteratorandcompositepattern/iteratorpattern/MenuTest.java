package designpattern.iteratorandcompositepattern.iteratorpattern;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class MenuTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);

        waitress.printMenu();
    }
}
