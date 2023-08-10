package model;

import view.BPMObserver;
import view.BeatObserver;

public interface HeartModelInterface {
    int getHeartRate();
    void removeObserver(BeatObserver o);
    void removeObserver(BPMObserver o);
    void registerObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
}
