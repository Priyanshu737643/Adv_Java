// WAP to use the Font class and Color class
import javax.swing.*;
import java.awt.*;

public class p23 extends JFrame {

    JLabel l1 = new JLabel("Name");
    JTextField tf1 = new JTextField(10);
    JButton b1 = new JButton("Save");

    // constructor
    p23() {
        setSize(500, 400);
        setVisible(true);
        setLayout(new FlowLayout());

        //* Color class
        l1.setForeground(Color.RED); // Color (class)  RED (Constant)
        // b1.setBackground(Color.YELLOW);
        Color c = new Color(176, 100, 160);
        b1.setBackground(c);
        b1.setForeground(Color.BLUE);

        //* Font class
        Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
        l1.setFont(f);
        b1.setFont(f);

        add(l1);
        add(tf1);
        add(b1);
    }
    public static void main(String[] args) {
        new p23();
    }
}

// 'awt' package  -->  Font , Color (class)

