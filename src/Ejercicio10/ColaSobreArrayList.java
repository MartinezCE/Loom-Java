package Ejercicio10;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import Ejercicio10.NoExisteElElemento;
/**
 * Implementación de Cola (Queue) basada en arreglos.
 * 
 */

public class ColaSobreArrayList <E> implements Cola <E> {

	ArrayList <E> elementos;

	ColaSobreArrayList(){
		elementos = new ArrayList<E>();


	}
	@Override
	public boolean estaVacia() {
		return elementos.isEmpty();
	}

	@Override
	public void acolar(E nuevoElemento) {
		elementos.add(nuevoElemento);
	}

	@Override
	public E desacolar() {
		try {
			E elementoAuxiliar = elementos.get(0);
			elementos.remove(0);
			return elementoAuxiliar;
			
		}catch (NoSuchElementException e) {

			throw new NoExisteElElemento();
		}
	}

	@Override
	public E obtenerFrente() {
		try {
			return elementos.get(0);
			
		}catch (NoSuchElementException e) {
			
			throw new NoExisteElElemento();
		}
	}
	
	
}
