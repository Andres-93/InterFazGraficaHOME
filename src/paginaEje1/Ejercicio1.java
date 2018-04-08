package paginaEje1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio1 {

	private static JLabel lblLabel;
	private static JFrame frame;
	private static JTextField num1;
	private static JButton btnCalcular;
	private static JLabel resultado;
	private static JButton boton;
	
	public static void main(String[] args) {
		
		num1 = new JTextField();
		lblLabel = new JLabel("INTRODUCE EL NUMERO");
		frame = new JFrame("ES PAR O IMPAR?");
		resultado = new JLabel("------");
		boton = new JButton("par o impar");
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								
					try {
						if(Integer.parseInt(num1.getText()) % 2 == 0)
							resultado.setText("PAR");
						else {
							resultado.setText("IMPAR");
						}
					}catch(NumberFormatException error) {
						resultado.setText("Error solo enteros");
				}			
			}
		});
		
		
		
		frame.getContentPane().add(lblLabel);
		frame.getContentPane().add(num1);
		frame.getContentPane().add(boton);
		frame.getContentPane().add(resultado);
		frame.pack();
		frame.setLayout(new GridLayout(0,1));
		frame.setSize(250, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
