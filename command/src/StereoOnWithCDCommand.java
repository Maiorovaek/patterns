public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(10);
    }

    @Override
    public void undo() {

    }
}
