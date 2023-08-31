package ejemplo2;

import java.io.*;

public class Texto {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.home")+"/archivo.txt"));
            bw.write("Esta es la primera linea de nuestro archivo");
            bw.newLine();
            bw.write("Esta seria una segunda linea de nuestro archivo\n");
            bw.write("Esta seria nuestra tercera y ultima linesssa\n");

            bw.close();


            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home")+"/archivo.txt"));
            String cadena = null;
            while((cadena = br.readLine())!=null){
                System.out.println(cadena);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
