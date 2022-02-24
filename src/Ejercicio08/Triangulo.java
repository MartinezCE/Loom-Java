package Ejercicio08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Triangulo {
	private static final List<int[]> triangulo= new ArrayList<int[]>();

	Triangulo(){
		int [] arreglo = {1,2,3,4,5};
		triangulo.add(arreglo);
		sumarValores(arreglo);

		Collections.reverse(triangulo);

		for(int [] fila: triangulo) {
			imprimir(fila);
			System.out.println();
		}
	}


	public void sumarValores(int [] n) {
		int [] arregloNuevo = new int [n.length-1];
		if(n.length !=1) {
			for(int i =1; i<n.length;i++) {
				arregloNuevo[i-1] = n[i-1]+ n[i];
			}
			triangulo.add(arregloNuevo);
			sumarValores(arregloNuevo);
		}

	}

	public void imprimir (int [] n) {
		for(int i=0; i<n.length;i++) {
			if(i==n.length-1) {
				System.out.println(n[i]);
			}else {
				System.out.println(n[i]);
			}
		}
	}
	public static void main(String [] args) {
		Triangulo nuevo = new Triangulo();
	}
}
