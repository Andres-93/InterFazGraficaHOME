package pruebaSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio6PruebaSwing {


	public static void main(String[] args) {
		
		java.awt.EventQueue.invokeLater (new Runnable() {
			
			public void run() {
				
				AleatorioGrafV vistaPrincipal = new AleatorioGrafV();
				vistaPrincipal.hacerVisible();
				
			}
		});

	}

}
