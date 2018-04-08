package paginaEje1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio3 {

	private static JButton boton;
	private static JFrame frame;
	private static JTextField num1;
	private static JTextField num2;
	private static JTextField num3;
	private static JLabel solucion1;
	private static JLabel solucion2;
	private static JLabel text1;
	private static JLabel text2;
	private static JLabel text3;
	
	
	public static void main(String[] args) {
		
		frame = new JFrame("Ecuacion 2do Grado");
		boton = new JButton("Buscar Soluciones");
		solucion1 = new JLabel("------");
		solucion2 = new JLabel("------");
		text1 = new JLabel("X^2");
		text2 = new JLabel("X");
		text3 = new JLabel("num");
		num1 = new JTextField();
		num2 = new JTextField();
		num3 = new JTextField();
		
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Double numero1 = 0.0;
				Double numero2 = 0.0;
				Double numero3 = 0.0;
				Double result1 = 0.0;
				Double result2 = 0.0;
				
				try {
					numero1 = Double.parseDouble(num1.getText());
					numero2 =  Double.parseDouble(num2.getText());
					numero3 = Double.parseDouble(num3.getText());
					result1 = (-numero2 + Math.sqrt(Math.pow(numero2, 2) - (4 * numero1 * numero3))) / (2 * numero1);	//Primera solucion
					result2 = (-numero2 - Math.sqrt(Math.pow(numero2, 2) - (4 * numero1 * numero3))) / (2 * numero1);	//Segunda sokucion
					
					if(Math.sqrt(Math.pow(numero2, 2) - (4 * numero1 * numero3)) > 0) {
						solucion1.setText("Solucion 1 : " + result1);
						solucion2.setText("Solucion 2 : "+ result2);						
					}
					else if(Math.sqrt(Math.pow(numero2, 2) - (4 * numero1 * numero3)) == 0) {
						result1 = -(numero2/(2*numero1));
						solucion1.setText("Solucion unica : " + result1);
					}
					else {
						solucion1.setText("No hay solucion posible");
					}
				}catch(NumberFormatException error) {
					solucion1.setText("Introduzca solo numeros");
				}			
			}
		});			
		frame.getContentPane().add(text1);
		frame.getContentPane().add(num1);
		frame.getContentPane().add(text2);
		frame.getContentPane().add(num2);
		frame.getContentPane().add(text3);
		frame.getContentPane().add(num3);
		frame.getContentPane().add(boton);
		frame.getContentPane().add(solucion1);
		frame.getContentPane().add(solucion2);
		frame.pack();
		frame.setLayout(new GridLayout(0,1));
		frame.setSize(250, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
