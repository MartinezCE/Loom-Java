package Ejercicio10;

public class NoExisteElElemento extends RuntimeException {
	
		private static final long serialVersionUID = 4352895925476767226L;
		public NoExisteElElemento() {
			super("No existe el elemento");
		}
}
