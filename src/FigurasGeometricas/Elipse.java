package FigurasGeometricas;

public class Elipse extends Figura{

	private double radioX, radioY,radio;
	private Punto centro;



	public Elipse (double radioMenor, double radioMayor,double centroX, double centroY) throws ErrorParametro {

		centro = new Punto (centroX, centroY);
		validarParametro (radioMenor, radioMayor);
		this.radioX = radioMenor;
		this.radioY = radioMenor;

	}


	public Elipse (double centroX, double centroY, double radio) {
		centro = new Punto (centroX, centroY);
		this.radio = radio;
	}

	@Override
	public void mover(double incrementoX, double incrementoY) {

		this.centro.mover(incrementoX, incrementoY);

	}


	@Override
	double calcularArea() {

		return Math.PI * radioX * radioY;
	}

	private void validarParametro (double radioMenor, double radioMayor ) throws ErrorParametro{

		if(radioMenor<0 || radioMayor>0) {
			throw new ErrorParametro ("Parametros invalidos");
		}
	}

}
