import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una cadena para contabilizar sus caracteres");
        int vocales = 0;
        String cadena  = sc.nextLine().toLowerCase();
        for(int i=0; i<cadena.length();i++){
            System.out.println("cadena.chartAt(i) = " + cadena.charAt(i));
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' ||
                    cadena.charAt(i) == ('o') || cadena.charAt(i) == 'u') {
                vocales++;
            }
        }
        System.out.println(cadena + ": " + vocales);


    }
}
