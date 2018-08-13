package designpattern.iteratorandcompositepattern.compositepattern;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class MenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Brekfast");
        MenuComponent dinerMenu = new Menu("DINER MENU","LUNCH");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Brakefast","Pancakes with fried eggs,sausage",true,2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast","Pancake with fried eggs,sausage",false,2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes","Pancake made with fresh blueberries",true,3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59));


        dinerMenu.add(new MenuItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99));
        dinerMenu.add(new MenuItem("BLT","Bacon with Lettuce & tomato on whole wheat",false,2.99));
        dinerMenu.add(new MenuItem("Soup of the day","Soup of the day,with a side of potato salad",false,3.29));
        dinerMenu.add(new MenuItem("Hotdog","A hot dog,with saurkraut,relish,onions,topped with cheese",false,3.05));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fires","Veggie burger on a whole wheat" +
                " bun,lettuce,tomata, and fries",true,3.99));
        cafeMenu.add(new MenuItem("Soup of the day","A cup of the soup of the day, with a side salad", false,3.69));
        cafeMenu.add(new MenuItem("Burrito","A large burrito, with whole pinto beans, salsa, guacamole",true,4.29));

        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey " +
               "crust,topped with vanilla ice cream",true,1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
