package Ejercicio10;

import java.io.IOException;

public class Main {
	public static void main (String [] args) {
		LogCSV archivo = new LogCSV ();
		try {
			archivo.crearCSV();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
