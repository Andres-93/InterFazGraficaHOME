package WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;

public class segundaPruebaWindowBulderJframe extends JFrame {
	
	private JLabel primerTexto;
	private JComboBox <String>coPrueba;
	private JComboBox <String>meses;
	private JCheckBox checkMagic;
	private JCheckBox chckbxEscucharMuscia;
	private String[] dias;
	private final ButtonGroup pajaros = new ButtonGroup();
	
	public segundaPruebaWindowBulderJframe() {
		super("mega prueba super apoteosica");
		mierdaParadentro();
	}

	private void mierdaParadentro() {
		dias = new String[]{"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		
		getContentPane().setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		getContentPane().setBackground(Color.MAGENTA);
		
		primerTexto = new JLabel("caja uno");
		primerTexto.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		primerTexto.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 200, 0)));
		primerTexto.setOpaque(true);
		primerTexto.setHorizontalAlignment(SwingConstants.CENTER);
		primerTexto.setBackground(Color.CYAN);
		
		JButton btnNewButton = new JButton("boton magico de archer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				primerTexto.setText("JUAN MARICON");
				
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setForeground(Color.GREEN);
		
		JScrollPane scrollPane = new JScrollPane();
		JTextArea areaTexto = new JTextArea();
		areaTexto.setLineWrap(true);
		areaTexto.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		areaTexto.setDisabledTextColor(Color.BLUE);
		areaTexto.setBackground(Color.ORANGE);
		areaTexto.setForeground(Color.BLUE);
		scrollPane.setViewportView(areaTexto);
		
		coPrueba = new JComboBox<String>();
		coPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primerTexto.setText("El valor seleccionado es: " + dias[coPrueba.getSelectedIndex()]);
			}
		});
		coPrueba.setModel(new DefaultComboBoxModel<String>(dias));
		
		meses = new JComboBox<String>();
		meses.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				primerTexto.setText("" + meses.getSelectedItem());
			}
		});
		
		
		meses.addItem("Enero");
		meses.addItem("febreo");
		meses.addItem("marso");
		meses.addItem("abrilito mi niño");
		
		checkMagic = new JCheckBox("leer");
		checkMagic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				primerTexto.setText("El valor seleccionado es: " + dias[coPrueba.getSelectedIndex()]);
			}
		});
		
		chckbxEscucharMuscia = new JCheckBox("escuchar muscia");
		

		 ButtonGroup buttonGroup = new ButtonGroup();
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JRadioButton rdbtnMujer = new JRadioButton("mujer");
		buttonGroup.add(rdbtnMujer);
		
		JRadioButton rdbtnHombre = new JRadioButton("hombre");
		rdbtnHombre.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange() == ItemEvent.DESELECTED) {
					primerTexto.setText("deselecionado la opcion hombre");
				} else if(e.getStateChange() == ItemEvent.SELECTED) {
					primerTexto.setText("seleccionada la opcion hombre");
				}
			}
		});
		buttonGroup.add(rdbtnHombre);
		
		JRadioButton rdbtnPajaro = new JRadioButton("pajaro");
		pajaros.add(rdbtnPajaro);
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(primerTexto, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(checkMagic)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(chckbxEscucharMuscia)
											.addGap(48))
										.addComponent(rdbtnPajaro))
									.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
									.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(meses, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addComponent(coPrueba, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(69)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnHombre)
								.addComponent(rdbtnMujer)))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(primerTexto, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addComponent(coPrueba, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(meses, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(checkMagic)
								.addComponent(chckbxEscucharMuscia))
							.addGap(18)
							.addComponent(rdbtnPajaro))
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnHombre)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnMujer)))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		
		getContentPane().setLayout(groupLayout);
	}
	
	public void hacerVisible() {
		this.setSize(700, 420);
		this.setVisible(true);			
	}
}
