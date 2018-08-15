package designpattern.compoundpattern.mvc;

/**
 * @author Zhang
 * @date 2018/8/15
 * @Description
 */
public class DJTest {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
