package designpattern.templatemethodpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public abstract class CaffeeineBeverageWithHook {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments(){     //钩子
        return true;
    }
}
