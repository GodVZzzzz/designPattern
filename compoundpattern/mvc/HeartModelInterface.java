package designpattern.compoundpattern.mvc;

/**
 * @author Zhang
 * @date 2018/8/15
 * @Description
 */
public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
