package designpattern.iteratorandcompositepattern.compositeIterator;

import designpattern.iteratorandcompositepattern.compositepattern.MenuComponent;

import java.util.Iterator;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();

            try {
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){}
        }
    }
}
