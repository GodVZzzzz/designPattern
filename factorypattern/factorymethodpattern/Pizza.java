package designpattern.factorypattern.factorymethodpattern;

import java.util.ArrayList;

/**
 * @author Zhang
 * @date 2018/8/10
 * @Description
 */
public abstract class Pizza {
    String name;    //名称
    String dough;   //面团类型
    String sauce;   //酱料
    ArrayList toppings = new ArrayList();   //调料

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for(int i = 0; i < toppings.size(); i++){
            System.out.println("   "+toppings.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
