// FLowLayout  -  JFrame, JLabel, JTextField, JButton, ActionListener
import javax.swing.*;
import java.awt.*; //? abstract window toolkit
import java.awt.event.*;
import java.awt.event.ActionListener;

public class p20 extends JFrame implements ActionListener {

    JLabel l1 = new JLabel("Enter the 1st Number: ");
    JLabel l2 = new JLabel("Enter the 2nd Number: ");
    JLabel l3 = new JLabel("Result: ");
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);
    JTextField tf3 = new JTextField(10);
    JButton b1 = new JButton("Add");
    JButton b2 = new JButton("Sub");

    // constructor
    p20() {
        setSize(600, 400);
        setVisible(true);
        setLayout(new FlowLayout()); //? import 'awt'
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(l3);
        add(tf3);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    // Overriding the method of ActionListener Interface
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        int a = Integer.parseInt(s1);
        String s2 = tf2.getText();
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        }
        else if (e.getSource() == b2) {
            c = a - b;
        }
        tf3.setText(String.valueOf(c));
    }
    
    public static void main(String[] args) {
        new p20();
    }
}


// NOTES:
//? can write labels above constructor, but cannot write methods outside constructor

//? flow layout

//? extends (used in inheritance)
//? implements (used in interface)

//* java.awt  -  abstract window toolkit
//* awt.event
//* Actionlistener  (interface)