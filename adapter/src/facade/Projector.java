package facade;

public class Projector {
    private String description;

    public Projector(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void wideScreenMode() {
        System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void tvMode() {
        System.out.println(description + " in mode (4x3 aspect ratio)");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
