package pruebaJPANELSvarios;

import java.awt.EventQueue;


public class ventanMAIN {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				PanelPrin prueba = new PanelPrin();
				prueba.hacerVisible();
			}
		});

	}

}
