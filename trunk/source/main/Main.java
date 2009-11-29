package main;

import java.io.IOException;

import vistas.LoginFrame;
import controlador.LoginControlador;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @author jonatan, candela
	 */
	public static void main(String[] args) throws IOException {
		new LoginFrame(new LoginControlador()).setVisible(true);	
	}

}
