import wheels.users.*;

public class Snowman {

    private Ellipse _head, _body, _leftEye, _rightEye;
    private Hat _hat;
    private ConversationBubble _bubble;

    public Snowman(int x, int y, String text) {
        _body = new Ellipse(java.awt.Color.white);
        _body.setSize(100, 100);
        
        _head = new Ellipse(java.awt.Color.white);
        _head.setSize(80, 80);
        
        _leftEye = new Ellipse(java.awt.Color.black);
        _leftEye.setSize(15, 15);
        
        _rightEye = new Ellipse(java.awt.Color.black);
        _rightEye.setSize(15, 15);
        
        _hat = new Hat();
        _hat.setLocation(x + 20, y + 180);

        _bubble = new ConversationBubble(text, ConversationBubble.TAIL_DIR_LEFT);
        _bubble.setLocation(x + 110, y + 110);
        
        setLocation(x, y);
        setOutline(java.awt.Color.black, 2);
    }

    public void setOutline(java.awt.Color color, int thickness) {
        _body.setFrameColor(color);
        _body.setFrameThickness(thickness);
        _head.setFrameColor(color);
        _head.setFrameThickness(thickness);
    }

    void setLocation(int x, int y) {
        _body.setLocation(x + 10, y + 300);
        _head.setLocation(x + 20, y + 240);
        _leftEye.setLocation(x + 35, y + 265);
        _rightEye.setLocation(x + 75, y + 265);
    }

}
