// Design a student application form using GridBagLayout
import javax.swing.*;
import java.awt.*;

public class p22 extends JFrame {

    JLabel l1 = new JLabel("Student");
    JLabel l2 = new JLabel("Name");
    JLabel l3 = new JLabel("Roll");
    JTextField tf1 = new JTextField(15); // input max 15 characters
    JTextField tf2 = new JTextField(15);
    JButton b1 = new JButton("Save");

    // constructor
    p22() {
        setSize(500, 400);
        setVisible(true);

        setLayout(new GridBagLayout());
        
        // create obj of GridBag constraints (class)
        GridBagConstraints gbc = new GridBagConstraints();

        //* l1  -  Student
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER; // to add the component in the center of the frame
        add(l1, gbc);

        //* l2  -  Name
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST; // to add the component in the left side of the frame
        add(l2, gbc);

        //* tf1  -  Name input field
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(tf1, gbc);

        //* l3  -  Roll
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(l3, gbc);

        //* tf2  -  Roll input field
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(tf2, gbc);

        //* b1  - Save button
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(b1, gbc);

    }
    public static void main(String[] args) {
        new p22();
    }
}

// (col,row)  -  (different from matrix)
// gridx()  -  col no.

//? l1
// gbc.gridx = 0  -  col no. 0
// gbc.gridy = 0  -  row no. 0
//    (0,0) and  col span 2  - to add the component in the center of the frame
// gbc.gridwidth = 2 - col span 2
// add(l1,gbc)  -  add the component to the frame with constraints

//? l2
// gbc.gridx = 0  -  col no. 0
// gbc.gridy = 1  -  row no. 1
// gbc.gridwidth = 1 - col span 1 //? for rest of the components, col span will be 1
// add(l2, gbc)  -  add the component at (0,1) with col span 1

