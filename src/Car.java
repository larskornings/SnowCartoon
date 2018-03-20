
import wheels.users.Ellipse;
import wheels.users.Rectangle;

public class Car {

    private Rectangle _lowerBody, _upperBody;
    private Ellipse _rightWheel, _leftWheel;

    public Car(int x, int y) {
        _lowerBody = new Rectangle(java.awt.Color.red);
        _lowerBody.setSize(200, 40);
        _upperBody = new Rectangle(java.awt.Color.green);
        _upperBody.setSize(90, 50);
        _leftWheel = new Ellipse(java.awt.Color.black);
        _leftWheel.setSize(35, 35);
        _rightWheel = new Ellipse(java.awt.Color.black);
        _rightWheel.setSize(35, 35);

        setLocation(x, y);
    }

    public void setLocation(int x, int y) {
        _lowerBody.setLocation(x, y + 50);
        _upperBody.setLocation(x + 100, y);
        _leftWheel.setLocation(x + 20, y + 80);
        _rightWheel.setLocation(x + 150, y + 80);
    }

}
