package designpattern.compoundpattern.mvc;

import javax.swing.*;

/**
 * @author Zhang
 * @date 2018/8/15
 * @Description
 */
public class BeatBar extends JProgressBar implements Runnable {
    JProgressBar progressBar;
    Thread thread;


    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }


    @Override
    public void run() {
        for(;;) {
            int value = getValue();
            value = (int)(value * 0.75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

