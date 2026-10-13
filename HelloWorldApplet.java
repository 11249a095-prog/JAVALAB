import java.applet.Applet;
import java.awt.Graphics;
public class HelloWorldApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, World! Welcome to Java Applets.", 50, 50);
    }
}