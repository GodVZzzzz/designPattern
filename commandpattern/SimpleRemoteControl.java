package designpattern.commandpattern;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
