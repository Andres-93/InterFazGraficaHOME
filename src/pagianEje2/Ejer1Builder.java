package pagianEje2;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;

import WindowBuilder.pruebasWindowBuilder;

import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class Ejer1Builder extends JFrame {
	
	private JLabel lblNewLabel;
	private JTextArea textArea;
	private JCheckBox chckbxSeleccionarPares;
	private JLabel resultadoFiltro;
	private JLabel numMayor;
	private JButton btnCalcular;
	private ArrayList<Integer> numerosArray = new ArrayList<Integer>();
	private JLabel lblNewLabel_1;
	private JLabel lblNumeroMayor;
	private boolean pares = false;
	public Ejer1Builder() {
		inicializar();
	}

	private void inicializar() {
		
		try {
			UIManager.setLookAndFeel(
					UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
		e.printStackTrace();
		}
		getContentPane().setBackground(Color.YELLOW);
		
		lblNewLabel = new JLabel("Introduce los 10 numeros");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		chckbxSeleccionarPares = new JCheckBox("Seleccionar Pares");
		chckbxSeleccionarPares.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxSeleccionarPares.setBackground(Color.MAGENTA);
		chckbxSeleccionarPares.setForeground(Color.BLUE);
		
		resultadoFiltro = new JLabel("");
		resultadoFiltro.setFont(new Font("Tahoma", Font.BOLD, 12));
		resultadoFiltro.setHorizontalAlignment(SwingConstants.CENTER);
		
		numMayor = new JLabel("");
		numMayor.setFont(new Font("Tahoma", Font.BOLD, 13));
		numMayor.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				obtenerArrayNumeros();
				
				if(chckbxSeleccionarPares.isSelected()) {
					mostrarPares();
					pares = true;
				}
				else {
					mostrarImpares();
				}
				buscarMayor();
				
			}
			
		});
		btnCalcular.setBackground(Color.RED);
		btnCalcular.setForeground(Color.BLUE);
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		lblNewLabel_1 = new JLabel("NUMEROS QUE CUMPLEN CONDICION");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNumeroMayor = new JLabel("NUMERO MAYOR");
		lblNumeroMayor.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
							.addGap(137))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
							.addGap(154))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxSeleccionarPares)
							.addGap(172))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNumeroMayor, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(resultadoFiltro, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
									.addComponent(numMayor, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)))
							.addGap(24))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(175)
					.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(159, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(268, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxSeleccionarPares)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumeroMayor, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(resultadoFiltro, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
						.addComponent(numMayor, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		getContentPane().setLayout(groupLayout);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void hacerVisible() {
		this.setSize(500, 500);
		this.setVisible(true);			
	}
	
	private void obtenerArrayNumeros() {
				
		String numeros = textArea.getText();
		
		StringTokenizer cadena = new StringTokenizer(numeros);
		
		while(cadena.hasMoreTokens()) {
			numerosArray.add(Integer.parseInt(cadena.nextToken()));
		}		
	}
	
	private void mostrarPares() {
		
		String cadena = "";		
		for(int i = 0; i < numerosArray.size() ; i++) {			
			if (numerosArray.get(i) % 2 == 0) {
				cadena += numerosArray.get(i) + " ";
			}			
		}
		resultadoFiltro.setText(cadena);
	}
	
	private void mostrarImpares() {
		
		String cadena = "";		
		for(int i = 0; i < numerosArray.size() ; i++) {			
			if (numerosArray.get(i) % 2 != 0) {
				cadena += numerosArray.get(i) + " ";
			}			
		}
		resultadoFiltro.setText(cadena);
	}
	
	private void buscarMayor() {
		
		int mayor = 0;
		
		for(int i = 0; i < numerosArray.size() ; i++) {	
			if(pares) {
				if (i == 0 && numerosArray.get(i) % 2 == 0) {
					mayor = numerosArray.get(i);
				}					
				if(numerosArray.get(i) > mayor && numerosArray.get(i) % 2 == 0) {
					mayor = numerosArray.get(i);
				}
			}else {				
				if (i == 0 && numerosArray.get(i) % 2 != 0) {
					mayor = numerosArray.get(i);
				}					
				if(numerosArray.get(i) > mayor && numerosArray.get(i) % 2 != 0) {
					mayor = numerosArray.get(i);
				}				
			}
		}
		numMayor.setText(mayor + "");		
	}
}
