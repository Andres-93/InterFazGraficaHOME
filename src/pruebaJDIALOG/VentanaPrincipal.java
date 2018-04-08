package pruebaJDIALOG;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
	
	private JButton btnSalir;
	private JButton btnAbrirVentana;
	private ventanaDialo1 ventana1;
	
	public VentanaPrincipal() {
		setUndecorated(true);
		
		getContentPane().setLayout(null);
		
		btnAbrirVentana = new JButton("ABRIR VENTANA");
		btnAbrirVentana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana1 = new ventanaDialo1(VentanaPrincipal.this, true);
				ventana1.setVisible(true);
			}
		});
		btnAbrirVentana.setBounds(99, 79, 245, 72);
		getContentPane().add(btnAbrirVentana);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(125, 186, 168, 41);
		getContentPane().add(btnSalir);
	}
	

	public void hacerVisible() {
		this.setSize(500, 500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
