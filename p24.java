// WAP to design 2 panels inside a frame
import javax.swing.*;
import java.awt.*;

public class p24 extends JFrame {

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel l1 = new JLabel("1st Panel");
    JLabel l2 = new JLabel("2nd Panel");

    // constructor
    p24() {
        setSize(500, 400);
        setVisible(true);
        p1.setBackground(Color.RED);
        p2.setBackground(Color.YELLOW);
        setLayout(new GridLayout(2,1));
        add(p1);
        add(p2);
        p1.add(l1);
        p2.add(l2);
    }
    public static void main(String[] args) {
        new p24();
    }
}

//* Default Layout
// JFrame  =  BorderLayout
// JPanel  =  FlowLayout