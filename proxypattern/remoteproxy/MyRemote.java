package designpattern.proxypattern.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Zhang
 * @date 2018/8/14
 * @Description
 */
public interface MyRemote extends Remote {
    public String sayHello()throws RemoteException;
}
