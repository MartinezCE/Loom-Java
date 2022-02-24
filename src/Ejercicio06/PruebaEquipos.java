package Ejercicio06;

public class PruebaEquipos {

	public static void main (String [] args) {

		String [] jugadores = new String [12];
		jugadores[0]="Rosita";
		jugadores[1]="Mariano";
		jugadores[2]="Martin";
		jugadores[3]="Valeria";
		jugadores[4]="Fabian";
		jugadores[5]="Luciano";
		jugadores[6]="Leandro";
		jugadores[7]="Leonardo";
		jugadores[8]="Julian";
		jugadores[9]="Lucas PL";
		jugadores[10]="Andres";
		jugadores[11]="Lucas V";

		ArmarEquipos equipos = new ArmarEquipos (jugadores);
		equipos.mostrarEquipos();



	}

}
