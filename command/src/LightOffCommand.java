public class LightOffCommand implements Command {
    Light light;


    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }

    @Override
    public String toString() {
        return super.toString() + light.location;
    }
}
