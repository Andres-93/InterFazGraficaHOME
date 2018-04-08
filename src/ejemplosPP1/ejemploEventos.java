package ejemplosPP1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ejemploEventos {
	
	private static JLabel label;
	private static JButton btnLimpiar ;
	private static JButton btnEscribir;
	private static JFrame frame;
	private static JButton mostrarAutor;
	
	public static void main(String[] args) {
	
		btnEscribir = new JButton("Escribir");
		btnLimpiar = new JButton("Limpir");
		mostrarAutor = new JButton("Autor");
		label = new JLabel("--");
		
		frame = new JFrame("Controlando Eventos");
		
		btnLimpiar.addActionListener(new ClaseActionListener());
		
		btnEscribir.addMouseListener(new MouseAdapter() {
	
			public void mouseClicked(MouseEvent e) {
			label.setText("HOLA MUNDO");
			}
			
		});	
		
		mostrarAutor.addActionListener(new ClaseActionListener()) ;
			
		
		
		
		frame.getContentPane().add(label);
		frame.getContentPane().add(btnLimpiar);
		frame.getContentPane().add(btnEscribir);
		frame.getContentPane().add(mostrarAutor);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
		frame.setLayout(new GridLayout(0,1));
		frame.pack();
		frame.setSize(250, 150);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static class ClaseActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(mostrarAutor)) {
			label.setText("andres");
			}
			else{
				label.setText("");
			}
			
		}
		
	}
}








	
/*
 * try {
UIManager.setLookAndFeel(
UIManager.getCrossPlatformLookAndFeelClassName());
} catch (Exception e) {
e.printStackTrace();
}

 * 
 * 
 */


