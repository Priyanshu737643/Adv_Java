// WAP to illustrate the use of Mouse event
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p26 extends JFrame implements MouseListener {

    JLabel l1 = new JLabel("Mouse testing");

    // constructor
    p26() {
        setSize(500, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l1);
        addMouseListener(this);  // adding listener to the frame
    }

    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
    }
    
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed");
    }
    
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released");
    }
    
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse Clicked");
    }

    public static void main(String[] args) {
        new p26();
    }
}

//* Interface
//? ActionListener :
// actionPerformed()
//? MouseListener :  
// mouseEntered()
// mouseExited()
// mousePressed()
// mouseReleased()
// mouseCLicked()
