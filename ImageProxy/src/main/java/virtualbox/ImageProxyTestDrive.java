package virtualbox;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("My pictures");
    JMenuBar menuBar = new JMenuBar();
    JMenu menu;
    Hashtable<String, String> pictures = new Hashtable<String, String>();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }


    public ImageProxyTestDrive() throws Exception {
        pictures.put("Cake",
                "https://img.freepik.com/free-photo/a-cupcake-with-a-strawberry-on-top-and-a-strawberry-on-the-top_1340-35087.jpg?w=740&t=st=1689878773~exp=1689879373~hmac=6f17549c57572b2a48dd673c526bbe46f5afcb909f0413722bd7cc5505c7d275");
        pictures.put("Fox",
                "https://img.freepik.com/premium-photo/fox-with-a-hat-and-a-broom-in-his-hand_593294-5261.jpg?w=1380");
        pictures.put("Sun", "https://avatars.mds.yandex.net/i?id=a859c5b1c3415096eaf48b9661aaa2696cfde1ce-8209975-images-thumbs&n=13");

        URL initialURL = new URL(pictures.get("Sun"));
        menu = new JMenu("Pictures");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration<String> e = pictures.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(
                    event -> {
                        imageComponent.setIcon(new ImageProxy(getPictureUrl(event.getActionCommand())));
                        frame.repaint();
                    });
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 1000);
        frame.setVisible(true);
    }

    URL getPictureUrl(String name) {
        try {
            return new URL((String) pictures.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
