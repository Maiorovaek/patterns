package Applet;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {

    String message;

    public void init() {
        message = "I'm alive";
        repaint();
    }

    public void start() {
        message = "Now, I'm starting up...";
    }

    public void stop() {
        message = "Oh, now I'm stopped...";
    }

    public void destroy() {
        //applet destroyed
    }

    public void paint(Graphics graphics) {
        graphics.drawString(message, 5, 15);
    }
}
