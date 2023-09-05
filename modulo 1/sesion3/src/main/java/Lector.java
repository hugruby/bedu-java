import java.util.Scanner;

public class Lector {

    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Escribe el texto: ");
        String texto = lector.leeEntrada();
        Contador contador = new Contador();
        int cuentaVocales = contador.cuentaVocales(texto);
        int cuentaConsonantes = contador.cuentaConsonantes(texto);
        int cuentaNumeros = contador.cuentaNumeros(texto);
        int cuentaSimbolos = contador.cuentaSimbolos(texto);

        System.out.println("cuentaVocales = " + cuentaVocales);
        System.out.println("cuentaConsonantes = " + cuentaConsonantes);
        System.out.println("cuentaNumeros = " + cuentaNumeros);
        System.out.println("cuentaSimbolos = " + cuentaSimbolos);
    }
    Scanner sc = new Scanner(System.in);


    public void muestraMensaje(String cadena){
        System.out.println(cadena);
    }

    public String leeEntrada(){
        return sc.nextLine();
    }
}
