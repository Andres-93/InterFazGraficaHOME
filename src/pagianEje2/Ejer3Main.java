package pagianEje2;

import java.awt.EventQueue;

public class Ejer3Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				Ejer3Vista prueba = new Ejer3Vista();
				prueba.hacerVisible();
			}
		});

	}

}
