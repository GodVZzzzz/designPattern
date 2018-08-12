package designpattern.adapterpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class WindTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
