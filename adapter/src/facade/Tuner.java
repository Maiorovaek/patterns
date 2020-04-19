package facade;

public class Tuner {
    private Amplifier amplifier;
    private String description;

    public Tuner( String description, Amplifier amplifier) {
        this.amplifier = amplifier;
        this.description = description;
    }

    public void on() {
    }

    public void off() {
    }

    public void setAm() {
    }

    public void setFm() {
    }

    public void setFrequency() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
