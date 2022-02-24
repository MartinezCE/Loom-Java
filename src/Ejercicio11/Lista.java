package Ejercicio11;

public class Lista {
	private Nodo actual;
	private int tamanio, eliminados;

	Lista() {
		actual = null;
		tamanio = 0;
		eliminados = 0;
	}

	public void completarLista(int asistentes) {
		for (int i = 0; i < asistentes; i++) {
			agregarNodo(i+1);
		}
		actual = actual.siguienteNodo;
	}

	public void procesoLista(String[] cebadores, Archivo file){
		Nodo auxiliar = actual;
		for (String ai: cebadores) {
			auxiliar = avanzoSiguiente(Integer.parseInt(ai), auxiliar);
			Nodo aventureroRetirado = auxiliar.siguienteNodo;
			auxiliar.siguienteNodo = aventureroRetirado.siguienteNodo;
			auxiliar = auxiliar.siguienteNodo;
			eliminados++;
			tamanio--;
			file.escribirLog(aventureroRetirado.dato);
		}
		file.escribirLogLn(eliminados);
	}

	private void agregarNodo(int elemento) {
		Nodo nuevoNodo = new Nodo(elemento);
		if(!estaVacia()) {
			nuevoNodo.siguienteNodo = actual.siguienteNodo;
			actual.siguienteNodo = nuevoNodo;
		}
		actual = nuevoNodo;
		tamanio++;
	}

	private boolean estaVacia() {
		return actual == null;
	}

	private Nodo avanzoSiguiente(int iterador, Nodo nodo) {
		int length = (tamanio + iterador) - 1;
		while (length != 0) {
			nodo = nodo.siguienteNodo;
			length--;
		}
		return nodo;
	}
}