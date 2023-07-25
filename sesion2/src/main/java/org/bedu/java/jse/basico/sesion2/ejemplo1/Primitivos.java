package org.bedu.java.jse.basico.sesion2.ejemplo1;

public class Primitivos {
    public static void main(String[] args) {
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        float valorFloat = 1.5F;
        double valorDouble = 1.5D;


        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);

        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);

        boolean valorBoolean = true;
        char valorChar = 'B';
        System.out.println("boolean: " + valorBoolean);
        System.out.println("char: " + valorChar);

        float numFloat = 1.5f;
        int numInt1 = (int)numFloat;
        System.out.println("numInt1: " + numInt1);

        char numChar = 'M';
        int numInt2 = (int)numChar;
        System.out.println("numInt2: " + numInt2);


        boolean numBool = true;
//        char numInt3 = (char)numBool;
        System.out.println("valorInt: " + valorInt);

        valorChar++;
        System.out.println("valorChar: " + valorChar);



        byte valorByte2 = Byte.MAX_VALUE;
        valorByte2+=2;
        System.out.println(valorByte2);

        byte valorByte3 = Byte.MIN_VALUE;
        System.out.println(valorByte3);
        valorByte3 -= 1;
        System.out.println(valorByte3);

    }
}
