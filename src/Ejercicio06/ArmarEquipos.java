package Ejercicio06;

import java.util.Stack;

public class ArmarEquipos {

	private Stack <String> equipoA;
	private Stack <String> equipoB;

	public ArmarEquipos (String [] jugadores) {

		equipoA = new Stack <String>();
		equipoB = new Stack <String>();

		obtenerEquipo(jugadores);

	}


	public void obtenerEquipo (String [] jugadores){

		for(int i=0; i<jugadores.length;i++) {
			if(i% 2 == 0) {
				this.equipoA.push(jugadores[i]);

			}
			else {
				this.equipoB.push(jugadores[i]);

			}
		}

	}

	public void mostrarEquipos () {

		while (! equipoA.isEmpty()) {

			System.out.println("Equipo A: " + equipoA.pop());
		}
		while(! equipoB.isEmpty()) {

			System.out.println("Equipo B:" + equipoB.pop());
		}
	}


}


