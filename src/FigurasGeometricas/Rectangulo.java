package FigurasGeometricas;

public class Rectangulo extends Figura{

	protected Punto esquinaInferiorIzquierda;
	protected double base, altura,lado;





	public Rectangulo(double verticeIzquierdoX, double verticeIzquierdoY, double base, double altura)throws ErrorParametro {

		esquinaInferiorIzquierda = new Punto (verticeIzquierdoX,verticeIzquierdoY);
		validarParametros (base,altura);
		this.base= base;
		this.altura= altura;
	}

	public Rectangulo (double verticeIzquierdoX, double verticeIzquierdoY, double lado) {
		esquinaInferiorIzquierda = new Punto (verticeIzquierdoX,verticeIzquierdoY);
		this.lado =lado;
	}



	@Override
	public double calcularArea() {

		return (this.base * this.altura);

	}

	@Override
	public void mover(double incrementoX, double incrementoY) {
		this.esquinaInferiorIzquierda.mover(incrementoX, incrementoY);

	}

	private void validarParametros (double base,double altura )throws ErrorParametro {
		if(base <= 0 || altura <= 0 ) {
			throw new ErrorParametro ("Parametros invalidos");
		}
	}
}
