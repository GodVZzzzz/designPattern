package designpattern.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Zhang
 * @date 2018/8/14
 * @Description
 */
public class PersonProxy extends Proxy {


    /**
     * Constructs a new {@code Proxy} instance from a subclass
     * (typically, a dynamic proxy class) with the specified value
     * for its invocation handler.
     *
     * @param h the invocation handler for this proxy instance
     * @throws NullPointerException if the given invocation handler, {@code h},
     *                              is {@code null}.
     */
    protected PersonProxy(InvocationHandler h) {
        super(h);
    }

    public static PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),new OwnerInvocationHandler(person));
    }

    public static PersonBean getNonOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),new NonOwnerInvocationHandler(person));
    }
}
