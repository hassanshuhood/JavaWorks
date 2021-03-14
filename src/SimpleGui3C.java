import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3C implements ActionListener {
    JFrame frame;
    JButton button1;
    JButton button2;
    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("Change colors");
        button2 = new JButton("Change other");
        button1.addActionListener(this);
        button2.addActionListener(this);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.NORTH, button2);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == button1) {
        frame.repaint();
        button1.setText("Button1 hurt!");
        } else {
        button2.setText("That hurt!");
        }
        }
}

class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        // Code to fill the oval with a random color
        // See page 367 for the code
    }
}