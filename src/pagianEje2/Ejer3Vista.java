package pagianEje2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import WindowBuilder.pruebasWindowBuilder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class Ejer3Vista extends JFrame {
	private JLabel titulo;
	private JSpinner codigo1;
	private JSpinner codigo3;
	private JSpinner codigo2;
	private JLabel colorElegido;
	private JButton btnObtenerColro;
	private JLabel textoError;
	
	
	public Ejer3Vista() {
		super("Seleccion de color");
		iniciarVista();
	}

	private void iniciarVista() {
		
		try {
			UIManager.setLookAndFeel(
					UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		
		setResizable(false);
		
		titulo = new JLabel("SELECCIONE EL CODIDO RGB PARA VER COLOR");
		titulo.setFont(new Font("Poor Richard", Font.PLAIN, 18));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		codigo1 = new JSpinner();
		codigo1.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		
		codigo2 = new JSpinner();
		codigo2.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		
		codigo3 = new JSpinner();
		codigo3.setModel(new SpinnerNumberModel(0, 0, 255, 1));
		
		colorElegido = new JLabel("");
		colorElegido.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		colorElegido.setOpaque(true);
		colorElegido.setBackground(new Color(51, 204, 204));
		
		JLabel lblR = new JLabel("R");
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblG = new JLabel("G");
		lblG.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnObtenerColro = new JButton("Obtener Color");
		btnObtenerColro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				cambiarColor();
			}

			
		});
		
		textoError = new JLabel("");
		textoError.setForeground(new Color(204, 0, 0));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addComponent(colorElegido, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblR, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(104)
							.addComponent(lblG, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(89)
							.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
							.addGap(50))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(codigo1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
							.addComponent(codigo2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(61)
							.addComponent(codigo3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(36))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(128)
					.addComponent(btnObtenerColro, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(144, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(89, Short.MAX_VALUE)
					.addComponent(textoError, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
					.addGap(62))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblR, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblG, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblB, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(codigo1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(codigo3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
							.addComponent(codigo2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnObtenerColro, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(textoError, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(colorElegido, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	private void cambiarColor() {
		
		
		if((int) codigo1.getValue() < 0 || (int) codigo1.getValue() > 255 ||  (int) codigo2.getValue() < 0 ||  (int) codigo2.getValue() > 255 ||  (int) codigo3.getValue() < 0 ||  (int) codigo3.getValue() > 255) {		
			textoError.setText("*Error, ningun numero debe superar 255");
		}else {
			colorElegido.setBackground(new Color((int) codigo1.getValue(), (int) codigo2.getValue(),(int) codigo3.getValue()));
		}
		
	}
	
	public void hacerVisible() {
		this.setSize(450, 400);
		this.setVisible(true);			
	}
	
}
