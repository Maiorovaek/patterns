package facade;

public class Amplifier {
    private CdPlayer cd;
    private DvdPlayer dvd;
    private String description;
    private Tuner tuner;


    public Amplifier(String description) {
        this.description = description;
    }


    public void on() {
        System.out.println(description + " on");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
        System.out.println(description + " setting DVD player to Top-O-Line DVD Player " + dvd);
    }

    public void setVolume(int level) {
        System.out.println("Top-O-Line Amplfier setting volume to   " + level);
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setCd(CdPlayer cd) {
        this.cd = cd;
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line CD Player " + cd);

    }

    public void setStereoSound() {
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println(" " + tuner);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
