package Ejercicio11;


public class Main {
    public static void main(String[] args) {
        try {
            Archivo archivo = new Archivo();
            archivo.readFile();

            Lista listaAventureros = new Lista();
            listaAventureros.completarLista(archivo.getOiasPresentes());

            String[] aisPresentes = archivo.getNumeroDeAIS();
            listaAventureros.procesoLista(aisPresentes, archivo);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
