package ejemplosPP1;

import java.awt.BorderLayout;

import javax.swing.*;
public class ejemplo1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana HolaMundo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel("HolaMundo");
		JLabel label1 = new JLabel("Me llamo Andres");
		frame.getContentPane().add(label);
		frame.getContentPane().add(label1);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
