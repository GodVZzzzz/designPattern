package designpattern.compoundpattern.mvc;

/**
 * @author Zhang
 * @date 2018/8/15
 * @Description
 */
public class HeartAdapter implements BeatModelInterface {
    HeartModelInterface heart;

    public HeartAdapter(HeartModelInterface heart){
        this.heart = heart;
    }

    public void initialize(){}

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public void registerObserver(BeatObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        heart.removeObserver(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        heart.registerObserver(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        heart.removeObserver(o);
    }
}
