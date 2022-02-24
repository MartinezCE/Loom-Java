package Ejercicio09;

public class Baldosas {

	public static void main (String [] args) {
		Baldosas baldosas = new Baldosas ();
		System.out.println(baldosas.getCant(7,2));
	}

	private boolean par(int x) {
		boolean validar = false;
		if(x%2==0) {
			return validar = true;
		}
		return validar;
	}

	public int getCant (int ancho, int alto) {
	
		if(ancho<=0 || alto<=0) {
			return 0;
		}
		else if (par(ancho) && par(alto)) {
			return getCant(ancho/2,alto/2);
		}
		else if (!par(ancho) && !par(alto)) {
			return  ancho -1+ alto + getCant(ancho/2,alto/2);
		}
		else if(!par(ancho) && par(alto)) {
			return  alto + getCant(ancho/2,alto/2);			
		}
		else if(par(ancho) && !par(alto)) {
			return  ancho + getCant(ancho/2,alto/2);
		}
		
		return -1;		
	}
}
