package isr;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class ventanaCalculator extends JFrame {
	
	public ventanaCalculator(){
		super("Calculadora de ISR");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(720,600));
		this.setLocationRelativeTo(null);
		
		controlCalculator cc= new controlCalculator();
		this.add(cc, BorderLayout.WEST);
		
		pack();
		this.setVisible(true);		
	}

	public static void main(String[] args) {
		ventanaCalculator prueba= new ventanaCalculator();
		

	}

}