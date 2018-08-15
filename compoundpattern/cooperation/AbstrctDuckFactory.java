package designpattern.compoundpattern.cooperation;

/**
 * @author Zhang
 * @date 2018/8/15
 * @Description
 */
public abstract class AbstrctDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
