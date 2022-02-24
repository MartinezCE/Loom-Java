package AnalisisDeAlgoritmos;

public class Main {


	public static void main(String[] args) {


		int numero = 15; 

		int[] numeros = {0, 1, 2, 3, 5, 6, 7, 8,9, 11, 12};

		BusquedaOrdenNumero unaBusqueda = new BusquedaOrdenNumero();

		unaBusqueda.buscarNumeroFaltanteBB(numero, numeros); // busqueda binaria

		unaBusqueda.buscarNumeroFaltanteBS(numero, numeros); // busqueda secuencial
	}


}
