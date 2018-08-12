package designpattern.adapterpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class DuckTest {
    public static void main(String[] args) {

        Turkey turkey = new WindTurkey();
        Duck turkeyDuck = new TurkeyAdapter(turkey);

        turkeyDuck.quack();
        turkeyDuck.fly();
    }
}
