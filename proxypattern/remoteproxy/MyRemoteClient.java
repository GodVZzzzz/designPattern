package designpattern.proxypattern.remoteproxy;

import java.rmi.*;

/**
 * @author Zhang
 * @date 2018/8/14
 * @Description
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go(){
        try {
            MyRemote service = (MyRemote) Naming.lookup( "rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
