package FigurasGeometricas;


public class Punto implements Mover {
	
	protected double posicionX, posicionY;
	
	public Punto (double posicionX, double posicionY)  {
		
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public double getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(double posicionX) {
		this.posicionX = posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(double posicionY) {
		this.posicionY = posicionY;
	}

	@Override
	public void mover(double incrementoX, double incrementoY) {
		this.posicionX += incrementoX;
		this.posicionY += incrementoY;
	}
	
	
	public double distanciaEntreDosPuntos(Punto puntoAComparar) {
		double temp = (	(Math.pow((this.posicionX - puntoAComparar.getPosicionX()), 2)) + 
				(Math.pow((this.posicionY - puntoAComparar.getPosicionY()), 2)) );
		return Math.sqrt(temp);
	}
}
