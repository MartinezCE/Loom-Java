package Ejercicio07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Descubrir {

	private List<String> alumnos;

	public  Descubrir() {
		alumnos = new ArrayList<String>();
		completarLista(alumnos);
		coleccionDeAlumnos (alumnos);
	}


	private void coleccionDeAlumnos(List<String> alumnos2) {
		HashMap <String, Integer > nombresRepetidos = new HashMap<String, Integer>();

		for(String nombre :alumnos2) {
			if(nombresRepetidos.containsKey(nombre) ) {

				nombresRepetidos.put(nombre, nombresRepetidos.get(nombre)+1);

			}
			else {
				nombresRepetidos.put(nombre,	1);

			}

		}
		System.out.println(nombresRepetidos);
	}


	public void completarLista(List<String> nombre){
		nombre.add("Ana");
		nombre.add("Juana");
		nombre.add("Ana");
		nombre.add("Juan");
		nombre.add("Ana");
		nombre.add("Juana");
		nombre.add("Ana");
		nombre.add("Ana");
		nombre.add("Pilar");
		nombre.add("Ricardo");
		nombre.add("Juan");
		nombre.add("Ester");
		nombre.add("Juana");
		nombre.add("Pedro");
		nombre.add("Pilar");
		nombre.add("Juan");
		nombre.add("Federico");
		nombre.add("Juan");
		nombre.add("Manuel");
		nombre.add("Juan");
		nombre.add("Ismael");
		nombre.add("Juan");
		nombre.add("Ricardo");
		nombre.add("Juan");
		nombre.add("Juana");
	}


	public static void main (String [] args) {

		Descubrir alumnosRepetidos = new Descubrir ();

	}



}
