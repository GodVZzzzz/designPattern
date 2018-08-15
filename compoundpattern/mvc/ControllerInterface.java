package designpattern.compoundpattern.mvc;

/**
 * @author Zhang
 * @date 2018/8/15
 * @Description
 */
public interface ControllerInterface {

    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
