package Ejercicio11;

import java.io.*;
import java.util.Scanner;

public class Archivo {
    String entrada, salida;
    int oiasPresentes;
    String[] cantAIS;

    Archivo() {
        entrada = "aventureros.in";
        salida = "aventureros.out";
        oiasPresentes = 0;
    }

    public void readFile() throws FileNotFoundException {
        String path = System.getProperty("usuario.dir");

        File archivo = new File(path + "/" + entrada);
        Scanner registro = new Scanner(archivo);
        if(registro.hasNextLine()) {
            oiasPresentes = Integer.parseInt(registro.nextLine());
            String data = registro.nextLine();
            cantAIS = data.split(" ");
        }
        registro.close();
    }

    public void escribirLog(int datos) {
        try {
            PrintWriter pw = openFile();

            pw.print(datos);

            closeFile(pw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirLogLn(int datos) {
        try {
            PrintWriter escribir = openFile();

            escribir.println();
            escribir.print(datos);

            closeFile(escribir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getOiasPresentes() {
        return oiasPresentes;
    }

    public String[] getNumeroDeAIS() {
        return cantAIS;
    }

    private PrintWriter openFile() throws IOException {
        FileWriter file = new FileWriter(this.salida, true);
        BufferedWriter bw = new BufferedWriter(file);
        return new PrintWriter(bw);
    }

    private void closeFile(PrintWriter pw) {
        pw.flush();
        pw.close();
    }
}
