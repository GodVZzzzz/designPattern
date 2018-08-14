package designpattern.proxypattern.virtualproxy;

import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.util.*;

/**
 * @author Zhang
 * @date 2018/8/14
 * @Description
 */
public class ImageProxyTest {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws Exception{
        ImageProxyTest test = new ImageProxyTest();
    }

    public ImageProxyTest()throws Exception{
        cds.put("Ambient: Music for Airports","http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
        cds.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");

        URL initialURL = new URL((String) cds.get("Ima"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        for(Enumeration e = cds.keys(); e.hasMoreElements();){
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }
        Icon icon =new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name){
        try {
            return new URL((String) cds.get(name));
        }catch (MalformedURLException e){
            e.printStackTrace();
            return null;
        }
    }

}
