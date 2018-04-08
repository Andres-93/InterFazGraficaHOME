package pruebaSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import pruebaSwing.AleatorioGrafV.ClaseActionListener;

public class Ejercicio2CategoriaVentana extends JFrame {

	private JTextField categoria;
	private JLabel resultado;
	private JButton btnCalcular;
	
	public Ejercicio2CategoriaVentana() {	
		super("Bucar categoria");
		inicializarComponentes();
	}
	
	
	
	private void inicializarComponentes() {
		
		try {
			UIManager.setLookAndFeel(
					UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
		e.printStackTrace();
		}

	btnCalcular = new JButton("Calcular Categoria");
	resultado = new JLabel("------");
	categoria = new JTextField();		
		
	btnCalcular.addActionListener(new ClaseActionListener());
	
	this.getContentPane().add(categoria);
	this.getContentPane().add(btnCalcular);
	this.getContentPane().add(resultado);
	this.setLayout(new GridLayout(0,1));
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}

	public void hacerVisible() {			
		this.setSize(250, 250);	
		this.setVisible(true);			
	}
	
	public class ClaseActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			try {
				obtenerCategoria(Integer.parseInt(categoria.getText()));
			}catch(NumberFormatException error) {
				resultado.setText("Solo puede introducir numeros");
			}			
		}

		private void obtenerCategoria(int num) {
			
			switch(num) {
			
			case 7:
			case 8: resultado.setText("Pre-Benjamin");break;
			case 9:
			case 10:resultado.setText("Benjamin");break;
			case 11:
			case 12:resultado.setText("Alevin");break;
			case 13:
			case 14:resultado.setText("Infantil");break;
			case 15:
			case 16:resultado.setText("Cadete");break;
			case 17:
			case 18:
			case 19:resultado.setText("Juvenil");break;
			default: resultado.setText("No ha introducido una edad valida");
						
			}
			
		}
				
	}
	
	
}
