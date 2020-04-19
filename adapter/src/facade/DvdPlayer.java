package facade;

public class DvdPlayer {
    private Amplifier amplifier;
    private String description;
    private String title;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.amplifier = amplifier;
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void play(String title) {
        this.title = title;
        System.out.println(description + " playing \"" + title + "\"");
    }

    public void stop() {
        System.out.println(description + " stopped \"" + title + "\"");
    }

    public void eject() {
        title = null;
        System.out.println(description + " eject");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pause() {
    }

    public void setSurroundAudio() {
    }

    public void setTwoChannelAudio() {
    }

}
