package designpattern.statepattern;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
