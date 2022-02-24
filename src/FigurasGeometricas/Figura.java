package FigurasGeometricas;

public abstract class Figura implements Comparable, Mover {

		
	
	 abstract double calcularArea() ; 
	
	

	@Override
	public int compareTo(Figura figuraComparable) {
		
		if(calcularArea()>figuraComparable.calcularArea()) {
			return 1;
		}		
		else if (calcularArea()<figuraComparable.calcularArea()) {
			 return  -1;
		 }
			
		
		return 0;
	}

	 
}
