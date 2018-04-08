package WindowBuilder;

import java.awt.EventQueue;

public class JframeMain {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				segundaPruebaWindowBulderJframe prueba = new segundaPruebaWindowBulderJframe();
				prueba.hacerVisible();
			}
		});
	}
}


