package pagianEje2;

import java.awt.EventQueue;

import WindowBuilder.segundaPruebaWindowBulderJframe;

public class Ejer1Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				Ejer1Builder prueba = new Ejer1Builder();
				prueba.hacerVisible();
			}
		});
	}
}
