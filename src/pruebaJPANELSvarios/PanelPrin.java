package pruebaJPANELSvarios;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelPrin extends JFrame {
	
	private JButton btnAlala;
	private paneltexto panel;
	
	public PanelPrin() {
		
		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
		);
		panel = new paneltexto();
		panel.setBounds(-11, 0, 636, 406);
		layeredPane.add(panel);
		panel.setVisible(false);
		btnAlala = new JButton("alala");
		btnAlala.setBounds(153, 215, 309, 146);
		layeredPane.add(btnAlala);
		btnAlala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel.setVisible(true);
				
			}
		});
		getContentPane().setLayout(groupLayout);
	}
	
	public void hacerVisible() {
		this.setSize(450, 400);
		this.setVisible(true);			
	}
}
