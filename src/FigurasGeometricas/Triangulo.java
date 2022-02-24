package FigurasGeometricas;



public class Triangulo extends Figura {
	private double ladoA;
	private double ladoB;
	private double ladoC;
	private Punto verticeA;
	private Punto verticeB;
	private Punto verticeC;





	public Triangulo(double verticeA_X, double verticeA_Y, double verticeB_X, double verticeB_Y, double verticeC_X,double verticeC_Y) throws ErrorParametro {


		this.ladoA = verticeA.distanciaEntreDosPuntos(verticeB);
		this.ladoB = verticeB.distanciaEntreDosPuntos(verticeC);
		this.ladoC = verticeC.distanciaEntreDosPuntos(verticeC);
		verticeA = new Punto(verticeA_X,verticeA_Y);
		verticeB = new Punto(verticeB_X,verticeB_Y);
		verticeC = new Punto(verticeC_X,verticeC_Y);


	}

	@Override
	double calcularArea() {


		double semiPerimetro = (( ladoA + ladoB + ladoC)/2);
		return Math.sqrt(((semiPerimetro)*(semiPerimetro - ladoA) * (semiPerimetro - ladoB)* (semiPerimetro - ladoC)));


	}

	@Override
	public void mover(double incrementoX, double incrementoY) {
		verticeA.mover(incrementoX, incrementoY);
		verticeB.mover(incrementoX, incrementoY);
		verticeC.mover(incrementoX, incrementoY);
	}

}
