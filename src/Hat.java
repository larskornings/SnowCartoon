
import wheels.users.*;

public class Hat {

    private Rectangle _hatBrim, _hatUpper;

    public Hat() {
        _hatBrim = new Rectangle(java.awt.Color.black);
        _hatBrim.setSize(80, 20);
        _hatUpper = new Rectangle(java.awt.Color.black);
        _hatUpper.setSize(60, 60);
    }

    public void setLocation(int x, int y) {
        _hatUpper.setLocation(x + 10, y);
        _hatBrim.setLocation(x, y + 50);

    }
}
