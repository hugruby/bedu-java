public class Contador {
    public boolean isVocal(char c){
        return (
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
        );
    }

    public boolean isNumero(char c){
        short codigoAscii = (short)c;
        return (codigoAscii >= 48 && codigoAscii <=57) ;
    }

    public boolean isConsonante(char c){
        short codigoAscii = (short)c;
        return (codigoAscii >= 97 && codigoAscii <= 122) && !isVocal(c);
    }

    public boolean isSimbolo(char c){
        return (!isVocal(c) && !isNumero(c) && !isConsonante(c));
    }

    public int cuentaVocales(String palabra){
        int vocales = 0;
        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if(isVocal(caracter)){
                vocales++;
            }
        }
        return vocales;
    }

    public int cuentaNumeros(String palabra){
        int numeros = 0;

        for (char caracter : palabra.toCharArray()) {
            if(isNumero(caracter)){
                numeros++;
            }
        }

        return numeros;
    }

    public int cuentaConsonantes(String palabra){
        int consonantes = 0;

        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if(isConsonante(caracter)){
                consonantes++;
            }
        }

        return consonantes;
    }

    public int cuentaSimbolos(String palabra){
        int simbolos = 0;

        for (char caracter : palabra.toLowerCase().toCharArray()) {
            if(isSimbolo(caracter)){
                simbolos++;
            }
        }

        return simbolos;
    }


}
