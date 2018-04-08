package pruebaProfesional;

import java.awt.EventQueue;

import pruebaJPANELSvarios.PanelPrin;

public class princ {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				pruebainterfaz prueba = new pruebainterfaz();
				prueba.hacerVisible();
			}
		});

	}

}
