/* 
 * Chapter 2: SnowCartoonApp.java
 * Displays a yellow sun, a snowman with a hat, and a 
 * conversation bubble.
 * This program contains three classes.
 */
import java.awt.Color;
import wheels.users.*;

public class SnowCartoon extends Frame {

    private Snowman _snowman;
    private Snowman _snowman2;
    private Ellipse _sun;

    public SnowCartoon() {
        _snowman = new Snowman(30, 50, "Hej");
        _snowman2 = new Snowman(300, 50, "Hej på dig");

        _sun = new Ellipse(java.awt.Color.blue);
        _sun.setLocation(300, 40);
        _sun.setSize(60, 60);
    }

    public static void main(String[] argv) {
        SnowCartoon cartoon = new SnowCartoon();
        CarWindow cw = new CarWindow();
    }

}
