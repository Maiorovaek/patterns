package facade;

public class CdPlayer {
    private Amplifier amplifier;
    private String description;

    public CdPlayer(String description, Amplifier amplifier) {
        this.amplifier = amplifier;
        this.description = description;
    }

    public void on() {
    }

    public void play() {
    }

    public void stop() {
    }

    public void eject() {
    }

    public void off() {
    }

    public void pause() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
