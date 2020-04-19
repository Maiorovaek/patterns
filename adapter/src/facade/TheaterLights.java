package facade;

public class TheaterLights {
    private String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void dim(int i) {
        System.out.println(description + " dimming to " + i + "%");
    }

    public void on() {
        System.out.println(description + "  on");
    }

    public void off() {
        System.out.println(description + "  off");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
