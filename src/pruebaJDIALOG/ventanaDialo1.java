package pruebaJDIALOG;

import javax.swing.JDialog;

import java.awt.Frame;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaDialo1 extends JDialog {
	
	private JButton btnVolver;
	private JButton btnAbrirVentana;
	
	public ventanaDialo1(Frame padre, boolean modo) {
		
		super(padre,modo);						//Recibe el padrfe y el modo del Jdialog, si esta en true no permite intereactuar con el padre cuando esta abierto si esdta en false si deja
		inicializar();
	}

	private void inicializar() {
		btnAbrirVentana = new JButton("abrir ventana 2");
		btnVolver = new JButton("volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaDialo1.this.dispose();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(83)
							.addComponent(btnAbrirVentana, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(105)
							.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(100, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(btnAbrirVentana, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		this.setSize(450, 400);
		this.setLocationRelativeTo(null);
	}

}
