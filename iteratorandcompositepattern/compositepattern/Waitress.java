package designpattern.iteratorandcompositepattern.compositepattern;

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
}
