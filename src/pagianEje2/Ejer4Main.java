package pagianEje2;

import java.awt.EventQueue;

public class Ejer4Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				PanelPrinEj4 prueba = new PanelPrinEj4();
				prueba.hacerVisible();
			}
		});

	}

}
