package paginaEje1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio5 {
	
	private static JFrame frame;
	private static JButton btnCalcular;
	private static JLabel resultado;
	private static JTextField num;
	
	public static void main(String[] args) {
		
		frame = new JFrame("Calcular sueldo");
		btnCalcular = new JButton("calcular sueldo");
		resultado = new JLabel("------");
		num = new JTextField();	
		
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					calcularSueldo(Integer.parseInt(num.getText()));
				}catch(NumberFormatException error) {
					resultado.setText("Solo puede introducir numeros");
				}
			}
			
		});
			
		frame.getContentPane().add(num);
		frame.getContentPane().add(btnCalcular);
		frame.getContentPane().add(resultado);
		frame.pack();
		frame.setLayout(new GridLayout(0,1));
		frame.setSize(250, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	private static void calcularSueldo(int num) {
		
		int sueldo = 0;
		
		if (num <= 40) {
			sueldo = 16 * num;
		}
		else {
			sueldo = (40 * 16) + ((num - 40) * 20);
		}
		
		resultado.setText(sueldo + "€");
		
	}

}
