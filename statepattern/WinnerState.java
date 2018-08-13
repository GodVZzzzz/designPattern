package designpattern.statepattern;

/**
 * @author Zhang
 * @date 2018/8/13
 * @Description
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert now");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarter in machine");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn twice");
    }

    @Override
    public void dispense() {
        System.out.println("You're a winner! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else {
                System.out.println("Oops, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
