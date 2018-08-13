package designpattern.iteratorandcompositepattern.iteratorpattern;

import java.util.Hashtable;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class CafeMenu implements Menu{
    Hashtable menuItems = new Hashtable();

    public CafeMenu(){
        addItem("Veggie Burger and Air Fires","Veggie burger on a whole wheat" +
                " bun,lettuce,tomata, and fries",true,3.99);
        addItem("Soup of the day","A cup of the soup of the day, with a side salad", false,3.69);
        addItem("Burrito","A large burrito, with whole pinto beans, salsa, guacamole",true,4.29);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.put(menuItem.getName(),menuItem);
    }

    public Iterator createIterator(){
        return new CafeMenuIterator(menuItems);
    }

}
