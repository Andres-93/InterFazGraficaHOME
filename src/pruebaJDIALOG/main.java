package pruebaJDIALOG;

import java.awt.EventQueue;

import pruebaJPANELSvarios.PanelPrin;

public class main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				VentanaPrincipal prueba = new VentanaPrincipal();
				prueba.hacerVisible();
			}
		});

	}

}
