package paginaEje1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio6 {


	private static JFrame frame;
	private static JButton btnCalcular;
	private static JLabel resultado;
	private static JTextField num;
	
	
	public static void main(String[] args) {
		
		frame = new JFrame("Numero par inferior");
		btnCalcular = new JButton("obtener");
		resultado = new JLabel("------");
		num = new JTextField();	

		
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					obtenerNumero(Integer.parseInt(num.getText()));
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
	
	private static void obtenerNumero(int num) {
		
		Random rd = new Random();
		int random = 1;
		while(random % 2 != 0) {
			random = rd.nextInt(num);
		}
		resultado.setText(random + "");
	}

}
