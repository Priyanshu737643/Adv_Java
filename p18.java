// WAP to design a frame  (1st way)

import javax.swing.*;

public class p18 extends JFrame {

    JLabel l1 = new JLabel("Name");
    JLabel l2 = new JLabel("Roll");
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JButton b1 = new JButton("Save");

    p18() {
        setSize(500, 500);  // size of frame  //? mandatory
        setVisible(true);  // to make the frame visible  //? mandatory
        setTitle("Student Application Form"); // title of the frame
        setLocation(150, 100); // location of the frame
        // setLayout(new FlowLayout());
        setLayout(null);
    }
    public static void main(String[] args) {
        new p18();  // creating object of the frame
    }
}

// JLabel , JTextField, JButton  (classes) are used to create the components of the frame  -  these classes have constructors (written how to design the components) and methods (to perform the operations on the components)  -  these classes are present in javax.swing package

//* flow layout
// flow layout  = whoever comes first will be placed first  -  it is the default layout of the frame  -  we can change the layout of the frame by using setLayout() method  -  we can use BorderLayout, GridLayout, FlowLayout, etc.  -  these layouts are present in java.awt package

//* border layout
// border layout = divides the frame into 5 parts (North, South, East, West, Center)  -  we can add the components to the frame by using add() method  -  we can specify the location of the component by using BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST, BorderLayout.WEST, BorderLayout.CENTER

//* grid layout
/// grid layout = divides the frame into rows and columns  -  we can specify the number of rows and columns by using GridLayout(int rows, int cols) constructor  -  we can add the components to the frame by using add() method  -  the components will be added in the order they are added to the frame
