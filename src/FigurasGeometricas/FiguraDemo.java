package FigurasGeometricas;

import java.io.*;

public class FiguraDemo {

	public static void main(String[] args) throws Exception {

		String[] data = null;
		BufferedReader lector = null;
		CreadorDeArreglos arregloDeFiguras = new CreadorDeArreglos ();

		try {

			FileReader archivo = new FileReader("datos_para_crear_Figuras.txt");
			lector = new BufferedReader(archivo);


			String unaLinea;


			while ((unaLinea = lector.readLine()) != null) {

				data = unaLinea.split(":");
				CreadorDeFiguras preFigura = new CreadorDeFiguras(data);				
				arregloDeFiguras.completarArregloDeFiguras(preFigura.armarFigura());
			}
		} 

		catch (FileNotFoundException a) {
			a.printStackTrace();

		}
		catch(ErrorParametro c) {
			c.printStackTrace();

		}
		catch(Exception b){
			b.printStackTrace();
		}

		finally {

			try {
				lector.close();

				for (int i = 0; i < arregloDeFiguras.figurasGeometricas.length; i++) {

					System.out.println(arregloDeFiguras.figurasGeometricas[i]);
				}
			} 

			catch (IOException m) {
				m.printStackTrace();	

			}
		}



	}
}


