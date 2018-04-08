package pagianEje2;

import javax.swing.JFrame;
import javax.security.auth.callback.TextOutputCallback;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PanelPrinEj4 extends JFrame {
	private JPanel panelPrincipal;
	private JTextField textoProdcuto;
	private JLabel lblNewLabel;
	private JTextField cantidadTexto;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JLabel lblListaDeLa;
	private JList listaCompra;
	private ArrayList<Producto> lista = new ArrayList<Producto>();
	private JLabel mensajeError;
	private JButton btnAct;
	
	public PanelPrinEj4() {
		super("Lista compra");
		inicializar();
	}

	private void inicializar() {
		
		try {
			UIManager.setLookAndFeel(
					UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panelPrincipal, GroupLayout.PREFERRED_SIZE, 494, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panelPrincipal, GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
		);
		
		lblNewLabel = new JLabel("Nombre del producto");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textoProdcuto = new JTextField();
		textoProdcuto.setColumns(10);
		
		JLabel label2 = new JLabel("Cantidad");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.RED);
		label2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		cantidadTexto = new JTextField();
		cantidadTexto.setColumns(10);
		
		btnAgregar = new JButton("AGREGAR");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				introducirProducto();				
			}			
		});
		btnAgregar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAgregar.setForeground(Color.RED);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				eliminarProducto();
				
			}			
		});
		btnEliminar.setForeground(Color.RED);
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEliminar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		lblListaDeLa = new JLabel("LISTA DE LA COMPRA");
		lblListaDeLa.setBorder(new LineBorder(Color.RED, 2));
		lblListaDeLa.setForeground(Color.RED);
		lblListaDeLa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListaDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		mensajeError = new JLabel("");
		
		btnAct = new JButton("ACTUALIZAR");
		btnAct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				mostrarLista();				
			}
		});
		btnAct.setForeground(Color.RED);
		btnAct.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panelPrincipal = new GroupLayout(panelPrincipal);
		gl_panelPrincipal.setHorizontalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(119)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(88)
							.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
								.addComponent(cantidadTexto, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
								.addComponent(textoProdcuto, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelPrincipal.createSequentialGroup()
							.addGap(119)
							.addComponent(label2, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(111, Short.MAX_VALUE))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(55)
					.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
					.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addGap(76))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 477, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(94)
					.addComponent(mensajeError, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(109, Short.MAX_VALUE))
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addGap(27)
					.addComponent(lblListaDeLa, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(btnAct, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		gl_panelPrincipal.setVerticalGroup(
			gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipal.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textoProdcuto, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(cantidadTexto, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(mensajeError, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
						.addComponent(lblListaDeLa, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAct, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
		);
		
		listaCompra = new JList();
		scrollPane.setViewportView(listaCompra);
		panelPrincipal.setLayout(gl_panelPrincipal);
		getContentPane().setLayout(groupLayout);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	private void introducirProducto() {
		Producto producto = new Producto("" , 0);
		try {
			 producto = new Producto(textoProdcuto.getText(),Integer.parseInt(cantidadTexto.getText()));
			 if(!comprobarRepetidos()) {
					lista.add(producto);
				}
				else {
					mensajeError.setText("Producto repetido");
				}
		}catch(NumberFormatException error) {
			mensajeError.setText("Error cantidad debe ser un numeero");
		}
		
		
	}

	private boolean comprobarRepetidos() {
		
		boolean repetido = false;
		
		for(int i = 0; i < lista.size(); i++) {
			if(textoProdcuto.getText().equals(lista.get(i).getNombre())) {
				repetido = true;
			}
		}		
		return repetido;		
	}
	public void hacerVisible() {
		this.setSize(510, 740);
		this.setVisible(true);			
	}
	
	private void eliminarProducto() {
		
		if(comprobarRepetidos()) {
			
			for(int i = 0; i < lista.size(); i++) {
				if(lista.get(i).getNombre().equals(textoProdcuto.getText())) {
					lista.remove(i);
				}
			}	
			
		}else {
			mensajeError.setText("No se puede eliminar el prodcuto porque no esta en la lista");
		}
		
	}
	
	private void mostrarLista() {
		
		String[] aux = new String[lista.size()];
		
		for(int j = 0; j < lista.size() ; j++) {
			
			aux[j] = lista.get(j).toString();		
		}		
		listaCompra.setListData(aux);	
	}
}
