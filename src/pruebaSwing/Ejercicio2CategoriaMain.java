package pruebaSwing;

public class Ejercicio2CategoriaMain {

	public static void main(String[] args) {
		
		
		java.awt.EventQueue.invokeLater (new Runnable() {
			
			public void run() {
				
				Ejercicio2CategoriaVentana vistaPrincipal = new Ejercicio2CategoriaVentana();
				vistaPrincipal.hacerVisible();
				
			}
		});

	}

}
