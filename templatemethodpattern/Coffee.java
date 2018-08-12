package designpattern.templatemethodpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class Coffee extends CaffeineBeverage{

    public void brew(){
        System.out.println("Dripping coffee through filter");
    }

    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }
}
