package FigurasGeometricas;



public class CreadorDeFiguras {

	protected String tipoDeFigura;
	protected String[] parametrosDeFiguras;
	protected Figura miFigura;


	public CreadorDeFiguras (String [] datos) {


		tipoDeFigura = datos[0];

		parametrosDeFiguras = datos[1].split(",");


	}



	public Figura armarFigura () throws ErrorParametro {



		miFigura = null;

		if(this.tipoDeFigura == "Circulo"){
			double radio = Double.parseDouble(this.parametrosDeFiguras[0]);
			double centroX = Double.parseDouble(this.parametrosDeFiguras[1]);
			double centroY = Double.parseDouble(this.parametrosDeFiguras[2]);

			miFigura = new Circulo (radio, centroX, centroY);
		}



		if (this.tipoDeFigura == "Cuadrado") {
			double verticeIzquierdoX, verticeIzquierdoY, lado;

			verticeIzquierdoX = Double.parseDouble(this.parametrosDeFiguras[0]);
			verticeIzquierdoY = Double.parseDouble(this.parametrosDeFiguras[1]);
			lado = Double.parseDouble(this.parametrosDeFiguras[2]);


			miFigura = new Cuadrado(verticeIzquierdoX, verticeIzquierdoY,lado);

		}

		if (this.tipoDeFigura == "Rectangulo") {
			double verticeIzquierdoX, verticeIzquierdoY, base, altura;

			verticeIzquierdoX = Double.parseDouble(this.parametrosDeFiguras[0]);
			verticeIzquierdoY = Double.parseDouble(this.parametrosDeFiguras[1]);
			base = Double.parseDouble(this.parametrosDeFiguras[2]);
			altura = Double.parseDouble(this.parametrosDeFiguras[3]);


			miFigura = new Rectangulo(verticeIzquierdoX,verticeIzquierdoY, base, altura);

		}
		if (this.tipoDeFigura == "Elipse") {
			double semiEjeMayor, semiEjeMenor, centroX, centroY;

			semiEjeMayor = Double.parseDouble(this.parametrosDeFiguras[0]);
			semiEjeMenor = Double.parseDouble(this.parametrosDeFiguras[1]);
			centroX = Double.parseDouble(this.parametrosDeFiguras[2]);
			centroY = Double.parseDouble(this.parametrosDeFiguras[3]);


			miFigura = new Elipse(semiEjeMayor, semiEjeMenor, centroX,centroY);

		}
		if (this.tipoDeFigura == "Triangulo") {
			double verticeAX, verticeAY, verticeBX, verticeBY, verticeCX, verticeCY;

			verticeAX = Double.parseDouble(this.parametrosDeFiguras[0]);
			verticeAY = Double.parseDouble(this.parametrosDeFiguras[1]);
			verticeBX = Double.parseDouble(this.parametrosDeFiguras[2]);
			verticeBY = Double.parseDouble(this.parametrosDeFiguras[3]);
			verticeCX = Double.parseDouble(this.parametrosDeFiguras[4]);
			verticeCY = Double.parseDouble(this.parametrosDeFiguras[5]);


			miFigura = new Triangulo(verticeAX, verticeAY, verticeBX,verticeBY, verticeCX, verticeCY);

		}


		return miFigura;

	}



}
