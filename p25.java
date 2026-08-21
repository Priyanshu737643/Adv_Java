// pop-up window  +  ActionListener
// WAP to accept the radius of the circle and find its area
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p25 extends JFrame implements ActionListener {

    JLabel l1 = new JLabel("Radius: ");
    JTextField tf1 = new JTextField(10);
    JButton b1 = new JButton("Area");
    JOptionPane jop = new JOptionPane();
    // JOptionPane - class used to create pop-up window

    // constructor
    p25() {
        setSize(500, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l1);
        add(tf1);
        add(b1);
        b1.addActionListener(this);
    }

    // overriding the method of ActionListener Interface
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        double r = Double.parseDouble(s1);
        double area = 3.14 * r * r;
        jop.showMessageDialog(this, "Area of the circle is: " + area);
    }
    public static void main(String[] args) {
        new p25();
    }
}
