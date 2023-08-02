package virtualbox;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        this.imageURL = url;
    }

    public int getIconWidth() {
//        if (imageURL != null) {
//            return imageIcon.getIconWidth();
//        } else {
            return 800;
//        }
    }

    public int getIconHeight() {
//        if (imageURL != null) {
//            return imageIcon.getIconHeight();
//        } else {
            return 600;
//        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon){
        this.imageIcon = imageIcon;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(c,g,x,y);
        } else {
            g.drawString("Loading Pictures, please wait...", x+300, y+190);
            if(!retrieving){
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try{
                            setImageIcon(new ImageIcon(imageURL, "CD cover"));
                            c.repaint();
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }

    }
}
