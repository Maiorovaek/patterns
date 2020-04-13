public class Light implements Command {
    String location;

    public void on() {
        System.out.println("swich.Light is on " + location);
    }

    public void off() {
        System.out.println("swich.Light is off " + location);
    }

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    @Override
    public void execute() {

    }
}
