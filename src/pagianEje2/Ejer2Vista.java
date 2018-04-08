package pagianEje2;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JList;

public class Ejer2Vista extends JFrame {
	private JLabel lblIntroduceLos;
	private JLabel lblError;
	private JTextArea areaNumeros;
	private JComboBox selecPosNeg;
	private final ButtonGroup grupoBotones = new ButtonGroup();
	public Ejer2Vista() {
		getContentPane().setBackground(Color.WHITE);
		
		lblIntroduceLos = new JLabel("INTRODUCE LOS 10 NUMEROS");
		lblIntroduceLos.setBorder(new LineBorder(Color.RED, 2));
		lblIntroduceLos.setForeground(Color.RED);
		lblIntroduceLos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIntroduceLos.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblError = new JLabel("");
		lblError.setForeground(Color.RED);
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		
		areaNumeros = new JTextArea();
		
		selecPosNeg = new JComboBox();
		selecPosNeg.setForeground(Color.RED);
		selecPosNeg.setBackground(Color.RED);
		selecPosNeg.setFont(new Font("Tahoma", Font.BOLD, 12));
		selecPosNeg.setModel(new DefaultComboBoxModel(new String[] {"Positivo", "Negativo"}));
		selecPosNeg.setSelectedIndex(0);
		
		JLabel lblFiltros = new JLabel("Filtros");
		lblFiltros.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiltros.setForeground(Color.RED);
		lblFiltros.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFiltros.setBorder(new LineBorder(Color.RED, 2));
		
		JRadioButton rdbtnMultiplos3 = new JRadioButton("Multiplos 3");
		grupoBotones.add(rdbtnMultiplos3);
		rdbtnMultiplos3.setForeground(Color.RED);
		rdbtnMultiplos3.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JRadioButton rdbtnMultiplos7 = new JRadioButton("Multiplos 7");
		grupoBotones.add(rdbtnMultiplos7);
		rdbtnMultiplos7.setForeground(Color.RED);
		rdbtnMultiplos7.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JRadioButton rdbtnTodos = new JRadioButton("Todos");
		grupoBotones.add(rdbtnTodos);
		rdbtnTodos.setForeground(Color.RED);
		rdbtnTodos.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnAplicar = new JButton("APLICAR");
		btnAplicar.setForeground(Color.RED);
		btnAplicar.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JList list = new JList();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblIntroduceLos, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
								.addComponent(areaNumeros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblError, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(74)
									.addComponent(selecPosNeg, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblFiltros, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(12)
											.addComponent(rdbtnMultiplos3)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(rdbtnTodos, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
											.addGap(13))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(101)
									.addComponent(rdbtnMultiplos7, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(192)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(list, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAplicar, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(60)
							.addComponent(areaNumeros, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblError, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFiltros, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIntroduceLos, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(selecPosNeg, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addGap(48)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnTodos)
								.addComponent(rdbtnMultiplos3))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnMultiplos7)))
					.addGap(41)
					.addComponent(btnAplicar, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
	}
}
