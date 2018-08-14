package designpattern.proxypattern.remoteproxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Zhang
 * @date 2018/8/14
 * @Description
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl()throws RemoteException{}

    @Override
    public String sayHello() {
        System.out.println("Hello");
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
