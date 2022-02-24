package Ejercicio10;


import java.io.FileWriter;
import java.io.IOException;

public class LogCSV {
	ColaSobreArrayList <Integer> colaArrayList;
	ColaSobreLinkedList<Integer> colaLinkedList;
	TomarTiempo tiempo;
	
	LogCSV(){
		tiempo = new TomarTiempo();
		colaArrayList = new ColaSobreArrayList<Integer>();
		colaLinkedList = new ColaSobreLinkedList<Integer>();
	}
	
	public void crearCSV() throws IOException {

	FileWriter escribir = new FileWriter ("file.csv");
	
	escribir.write("Inserccion\n");
	// Escribimos con 1.000
	escribir.write("1000"+", "+tiempo.tiemposDeInserccionSobreArraylist(colaArrayList, 1000)+"Milisegundos"+", "+"ArrayList"+"\n");
	escribir.write("1000"+", "+ tiempo.tiemposDeInserccionSobreLinkedList(colaLinkedList, 1000)+"Milisegundos"+", "+"LinkedList"+"\n");
	// Escribimos con 10.000
	escribir.write("10000"+", "+tiempo.tiemposDeInserccionSobreArraylist(colaArrayList,10000)+"Milisegundos"+", "+"ArrayList"+"\n");
	escribir.write("10000"+", "+ tiempo.tiemposDeInserccionSobreLinkedList(colaLinkedList,10000)+"Milisegundos"+", "+"LinkedList"+"\n");
	//Escribimos con 100.000
	escribir.write("100000"+", "+tiempo.tiemposDeInserccionSobreArraylist(colaArrayList, 10000)+"Milisegundos"+", "+"ArrayList"+"\n");
	escribir.write("100000"+", "+ tiempo.tiemposDeInserccionSobreLinkedList(colaLinkedList, 10000)+"Milisegundos"+", "+"LinkedList"+"\n");
	//Escribimos con 1.000.000
	escribir.write("1000000"+", "+tiempo.tiemposDeInserccionSobreArraylist(colaArrayList, 10000)+"Milisegundos"+", "+"ArrayList"+"\n");
	escribir.write("1000000"+", "+ tiempo.tiemposDeInserccionSobreLinkedList(colaLinkedList, 10000)+"Milisegundos"+", "+"LinkedList"+"\n");	
	escribir.write("Remocion\n");
	//Escribimos con 1.000
	escribir.write("1000"+", "+tiempo.tiemposDeRemocionSobreArrayList(colaArrayList, 1000)+"Milisegundos"+", "+"ArrayList"+"\n");
	escribir.write("1000"+", "+tiempo.tiemposDeRemocionSobreLinkedList(colaLinkedList, 1000)+"Milisegundos"+", "+"LinkedList"+"\n");
	//Escribimos con 10.000
	escribir.write("10000"+", "+tiempo.tiemposDeRemocionSobreArrayList(colaArrayList, 10000)+"Milisegundos"+", "+"ArrayList"+"\n");
	escribir.write("10000"+", "+tiempo.tiemposDeRemocionSobreLinkedList(colaLinkedList, 10000)+"Milisegundos"+", "+"LinkedList"+"\n");
	//Escribimos con 100.000
	escribir.write("100000"+", "+tiempo.tiemposDeRemocionSobreArrayList(colaArrayList, 100000)+"Milisegundos"+", "+"ArrayList"+"\n");
	escribir.write("100000"+", "+tiempo.tiemposDeRemocionSobreLinkedList(colaLinkedList, 100000)+"Milisegundos"+", "+"LinkedList"+"\n");
	//Escribimos con 1.000.000
	escribir.write("1000000"+", "+tiempo.tiemposDeRemocionSobreArrayList(colaArrayList, 1000000)+"Milisegundos"+", "+"ArrayList"+"\n");
	escribir.write("1000000"+", "+tiempo.tiemposDeRemocionSobreLinkedList(colaLinkedList, 1000000)+"Milisegundos"+", "+"LinkedList"+"\n");
	
	escribir.close();
	}
}