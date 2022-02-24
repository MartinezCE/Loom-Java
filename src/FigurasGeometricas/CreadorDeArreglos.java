package FigurasGeometricas;

public class CreadorDeArreglos  {
	
	private int contador;
	protected Figura [] figurasGeometricas;
	
	
	public CreadorDeArreglos () {
		figurasGeometricas = new Figura [5];
		contador = 0;
		
	}
	


public Figura [] completarArregloDeFiguras (Figura miFigura) {
	
		if(this.figurasGeometricas[contador]==null) {
			this.figurasGeometricas[contador] = miFigura;
			contador++;
		}
    return this.figurasGeometricas;
	
}
}
