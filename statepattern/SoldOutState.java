package designpattern.statepattern;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("The gumball is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't insert a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Gumball is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball to dispense");
    }
}
