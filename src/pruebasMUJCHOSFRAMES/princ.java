package pruebasMUJCHOSFRAMES;

import java.awt.EventQueue;

import pruebaJPANELSvarios.PanelPrin;

public class princ {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				jframe1 prueba = new jframe1();
				prueba.hacerVisible();
			}
		});

	}

}
