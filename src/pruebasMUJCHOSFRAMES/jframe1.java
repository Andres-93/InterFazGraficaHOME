package pruebasMUJCHOSFRAMES;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jframe1 extends JFrame {
	private JButton btnAbrirSegundoPanel;
	private jframe2 panel2 = new jframe2();
	
	public jframe1() {
		
		btnAbrirSegundoPanel = new JButton("ABRIR SEGUNDO PANEL");
		btnAbrirSegundoPanel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel2.setVisible(true);
				jframe1.this.setVisible(false);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(88)
					.addComponent(btnAbrirSegundoPanel, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(165, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(88)
					.addComponent(btnAbrirSegundoPanel, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(111, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
	
	public void hacerVisible() {
		this.setSize(450, 400);
		this.setVisible(true);			
	}
}
