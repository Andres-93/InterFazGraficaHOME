package paginaEje1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio4 {

	private static JButton boton;
	private static JFrame frame;
	private static JTextField num;
	private static JLabel solucion;
	
	public static void main(String[] args) {
		
		frame = new JFrame("Comprobador de numeros capicuas");
		boton = new JButton("Comprobar si es capicua");
		solucion = new JLabel("------");
		num = new JTextField();

			
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					int numeroI = invertirNumero(Integer.parseInt(num.getText()));
					if(contarCifras(Integer.parseInt(num.getText())) != 3) throw new longitudNoValida("Unicamente un numero de 3 cifras");
					if (numeroI == Integer.parseInt(num.getText())) {
						solucion.setText("Es capicua");
					}
					else solucion.setText("No es capicua");
				}catch(NumberFormatException error) {
					solucion.setText("Error introduzca unicamente un numero");
				}catch(longitudNoValida error1) {
					solucion.setText(error1.getMessage());
				}
			}			
		});
		
				
		frame.getContentPane().add(num);
		frame.getContentPane().add(boton);
		frame.getContentPane().add(solucion);
		frame.pack();
		frame.setLayout(new GridLayout(0,1));
		frame.setSize(250, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	private static int invertirNumero(int num) {
		
		int numI = 0;
		
		while(num > 0) {			
			numI = num%10 + numI*10;			
			 num = num/10;			
		}		
		return numI;
	}
	
	private static int contarCifras(int num) {
		
		int numCifras = 0;
		
		while(num > 0) {
			numCifras++;
			num =  num / 10;
		}
		
		return numCifras;
	}			
}
