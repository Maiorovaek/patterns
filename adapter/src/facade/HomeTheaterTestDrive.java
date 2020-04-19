package facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-o_line AM Tuner", amplifier);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amplifier);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amplifier);
        Projector projector = new Projector("Top-O-Line Projector");
        Screen screen = new Screen("Theater Screen");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, dvd,
                cd, projector, lights, screen, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
