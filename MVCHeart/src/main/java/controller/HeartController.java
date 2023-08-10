package controller;

import model.HeartAdapter;
import model.HeartModelInterface;
import view.DJView;

public class HeartController implements ControllerInterface {
    HeartModelInterface heartModel;
    DJView view;

    public HeartController(HeartModelInterface heartModel) {
        this.heartModel = heartModel;
        view = new DJView(this, new HeartAdapter(heartModel));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void decreaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }
}
