package designpattern.iteratorandcompositepattern.iteratorpattern;

import java.util.ArrayList;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("K&B's Pancake Brakefast","Pancakes with fried eggs,sausage",true,2.99);
        addItem("Regular Pancake Breakfast","Pancake with fried eggs,sausage",false,2.99);
        addItem("Blueberry Pancakes","Pancake made with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    /*public ArrayList getMenuItems(){
        return menuItems;
    }*/

    public Iterator createIterator(){
        return new PancakeHouseIterator(menuItems);
    }
}
