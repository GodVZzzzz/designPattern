package designpattern.adapterpattern;

import com.sun.xml.internal.ws.api.server.Adapter;

/**
 * @author Zhang
 * @date 2018/8/12
 * @Description
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}

