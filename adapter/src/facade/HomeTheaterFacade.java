package facade;

public class HomeTheaterFacade {
    private Amplifier ampf;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier ampf, Tuner tuner, DvdPlayer dvd, CdPlayer cd,
                             Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.ampf = ampf;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();

        ampf.on();
        ampf.setDvd(dvd);
        ampf.setSurroundSound();
        ampf.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down ...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        ampf.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
