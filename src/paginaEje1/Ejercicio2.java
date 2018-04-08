package paginaEje1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio2 {

	private static JButton boton;
	private static JFrame frame;
	private static JTextField num;
	private static JLabel resultado;
	
	public static void main(String[] args) {
		
		frame = new JFrame("cambio dolar - euro");
		boton = new JButton("convertir");
		resultado = new JLabel("------");
		num = new JTextField();
		
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double cantidad = Double.parseDouble(num.getText()) * 0.812;
				
				resultado.setText(cantidad + "Euros");
				
			}
		});
		
				
		
		frame.getContentPane().add(num);
		frame.getContentPane().add(boton);
		frame.getContentPane().add(resultado);
		frame.pack();
		frame.setLayout(new GridLayout(0,1));
		frame.setSize(250, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}

}
