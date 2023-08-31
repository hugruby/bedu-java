import java.util.Scanner;

public class Lector {
    Scanner scanner = new Scanner(System.in);
    public String leeCadena(){
        System.out.print("Cadena: ");
        return scanner.nextLine();
    }

    public byte leeOpcion(){
        System.out.print("Opción: ");
        return scanner.nextByte();
    }
}
