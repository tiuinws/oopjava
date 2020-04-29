package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaSwing {
    public JavaSwing() {
	JButton button_msg = new JButton();
	button_msg.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    JOptionPane.showMessageDialog(null, "Hello World");
		}
	    });
    }
    public static void main(String[] args) {
	JFrame frame = new JFrame("App");
	JPanel panelMain = new Jpanel();
	frame.setContentPane(new JavaSwing().panelMain);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
    }
    //JButton button = new JButton("Button Msg");
    //JButton button = new JButton("Button Msg");

    // button.addActionListener(but -> {
    // TODO Set button code goes here.
    //  });
    
}
