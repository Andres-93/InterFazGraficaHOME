package ejemplosPP1;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;

public class EjemploBorderLayout {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ejemplo");
		ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contenedor = ventana.getContentPane();
		ventana.setLayout(new GroupLayout(contenedor));
		contenedor.add(new JButton("Centro"));
		contenedor.add(new JButton("Norte"), BorderLayout.NORTH);
		contenedor.add(new JButton("Sur"), BorderLayout.SOUTH);
		contenedor.add(new JButton("Este"), BorderLayout.EAST);
		contenedor.add(new JButton("Oeste"), BorderLayout.WEST);
		ventana.setSize(200, 200);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}
