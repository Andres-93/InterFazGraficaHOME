package pruebaProfesional;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class pruebainterfaz extends JFrame {
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	public pruebainterfaz() {
		setUndecorated(true);
		
		inicializar();
		
	}

	private void inicializar() {
		getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Salir");
		btnNewButton.setBackground(new Color(0, 102, 204));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(pruebainterfaz.class.getResource("/images/pruebaBoton.png")));
		btnNewButton_1.setBounds(184, 123, 156, 149);
		getContentPane().add(btnNewButton_1);
		btnNewButton.setBounds(428, 11, 89, 23);
		getContentPane().add(btnNewButton);
		JLabel lblfondo = new JLabel("");
		lblfondo.setBounds(0, 0, 527, 366);
		lblfondo.setIcon(new ImageIcon(pruebainterfaz.class.getResource("/images/fondo2.jpg")));
		getContentPane().add(lblfondo);
	}
	public void hacerVisible() {
		this.setVisible(true);	
		this.setSize(527, 366);
		this.setLocationRelativeTo(null);	//Coloca la pantalla en el centro
	}
}
