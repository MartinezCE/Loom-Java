package Ejercicio10;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Implementación de Cola (Queue) basada en una ListaEnlazada.
 * 
 */

public class ColaSobreLinkedList <E> implements Cola <E>{

	LinkedList<E> elementos;

	ColaSobreLinkedList(){
		elementos = new LinkedList<E>();
	}



	@Override
	public boolean estaVacia() {

		return elementos.isEmpty();
	}

	@Override
	public void acolar(E nuevoElemento) {
		elementos.addLast(nuevoElemento);
	}

	@Override
	public E desacolar() {
		try {
			return elementos.removeFirst();

		} catch (NoSuchElementException e) {

			throw new NoExisteElElemento();
		}
	}

	@Override
	public E obtenerFrente() {
		try {
			return elementos.getFirst();

		} catch (NoSuchElementException e) {

			throw new NoExisteElElemento();
		}
	}
}