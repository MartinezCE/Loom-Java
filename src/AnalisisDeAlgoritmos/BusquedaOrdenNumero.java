package AnalisisDeAlgoritmos;



public class BusquedaOrdenNumero {


	public int buscarNumeroFaltanteBB(int buscado,int[] arreglo) {
		if(buscado < arreglo.length) {
			throw new Error("El numero debe ser igual o mayor a "+ arreglo.length);
		}

		for (int i = 0; i < buscado; i++) {
			int encontro = binarySearch(arreglo, i);
			if(encontro < 0) {
				System.out.println("El valor " + i + " no se encuentra en el array");
				return i;
			}
		}
		return -1;
	}


	public int binarySearch(int[] arreglo, int buscado) {

		int inicio = 0; 
		int fin = arreglo.length - 1; 


		while (inicio <= fin) {

			int	medio = (inicio + fin) / 2;

			if (buscado == arreglo[medio]) {
				return medio;
			}
			if (buscado < arreglo[medio]) {
				fin = medio - 1;
			} else {
				inicio = medio + 1;
			}
		}
		return -1;

	}



	public int buscarNumeroFaltanteBS(int buscado,int[] arreglo) {
		if(buscado < arreglo.length) {
			throw new Error("El numero debe ser igual o mayor a"+arreglo.length );
		}
		for (int i = 0; i < buscado; i++) {
			int encontro = this.busquedaSecuencial(i, arreglo);
			if(encontro < 0) {
				System.out.println("El valor " + i + " no se encuentra en el array");
				return i;
			}
		}
		return -1;
	}



	private int busquedaSecuencial(int buscado, int[] arreglo) {

		int posicion = -1;

		for(int i = 0; i < arreglo.length; i++){

			if(arreglo[i] == buscado){
				posicion = i;

			}
		}
		return posicion;
	}


}
