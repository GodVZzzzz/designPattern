package designpattern.templatemethodpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class Tea extends CaffeineBeverage {

    public void brew(){
        System.out.println("Steeping the tea");
    }

    public void addCondiments(){
        System.out.println("Adding lemon");
    }
}
