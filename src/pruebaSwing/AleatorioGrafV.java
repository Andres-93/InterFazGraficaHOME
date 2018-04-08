package pruebaSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class AleatorioGrafV extends JFrame {

	private JButton btnCalcular;
	private JLabel resultado;
	private JTextField num;
		
	public AleatorioGrafV() {
		super("Aleatorio par");
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		try {
				UIManager.setLookAndFeel(
						UIManager.getCrossPlatformLookAndFeelClassName());
			} catch (Exception e) {
			e.printStackTrace();
			}

		btnCalcular = new JButton("obtener");
		resultado = new JLabel("------");
		num = new JTextField();		
		

		btnCalcular.addActionListener(new ClaseActionListener());
		
		this.getContentPane().add(num);
		this.getContentPane().add(btnCalcular);
		this.getContentPane().add(resultado);
		this.setLayout(new GridLayout(0,1));
		this.setSize(350, 350);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void hacerVisible() {		
		this.pack();
		this.setVisible(true);			
	}
	
	public class ClaseActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			try {
				obtenerNumero(Integer.parseInt(num.getText()));
			}catch(NumberFormatException error) {
				resultado.setText("Solo puede introducir numeros");
			}			
		}
				
	}
	
	private void obtenerNumero(int num) {
		
		Random rd = new Random();
		int random = 1;
		while(random % 2 != 0) {
			random = rd.nextInt(num);
		}
		resultado.setText(random + "");
	}
	
	
}
