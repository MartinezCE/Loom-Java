package Ejercicio10;



public class TomarTiempo {

	public long tiemposDeInserccionSobreArraylist
	(ColaSobreArrayList<Integer> elemento, int cantInsercciones ) {
		long ini = System.currentTimeMillis();
		for ( int i=0; i < cantInsercciones; i++ ) {
			elemento.acolar(i);
		}
		long fin = System.currentTimeMillis();
		return fin - ini;
	}


	public long tiemposDeInserccionSobreLinkedList
	(ColaSobreLinkedList<Integer> elemento, int cantInsercciones) {
		long ini = System.currentTimeMillis();
		for(int i=0;i<cantInsercciones;i++) {
			elemento.acolar(i);
		}
		long fin = System.currentTimeMillis();
		return fin - ini;
	}

	public long tiemposDeRemocionSobreArrayList
	(ColaSobreArrayList<Integer> elemento, int cantRemociones) {
		completarArrayList(elemento,cantRemociones);
		long ini = System.currentTimeMillis();
		for(int i=0;i<cantRemociones;i++) {
			elemento.desacolar();
		}long fin = System.currentTimeMillis();
		return fin-ini;
	}

	public long tiemposDeRemocionSobreLinkedList
	(ColaSobreLinkedList<Integer> elemento,int cantRemociones) {
		completarLinkedList(elemento,cantRemociones);
		long ini = System.currentTimeMillis();
		for(int i=0;i<cantRemociones;i++) {
			elemento.desacolar();
		}long fin = System.currentTimeMillis();
		return fin - ini;
	}

	private void completarLinkedList(ColaSobreLinkedList<Integer> elemento, int cantRemociones) {
		for(int i = 0; i<cantRemociones;i++) {
			elemento.acolar(i);
		}
	}


	private void completarArrayList
	(ColaSobreArrayList<Integer> elemento, int cantRemociones) {
		for (int i = 0; i < cantRemociones; i++) {
			elemento.acolar(i);
		}

	}
}