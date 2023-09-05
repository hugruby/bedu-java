package reto1;

import java.io.File;

public class Reto1 {
    public static void main(String[] args) {
        File archivo = new File("/Users/groovy/IdeaProjects/sesion8/src/main/resources/cursos/cursos.txt");
        String uriParent = archivo.getParent();
        File parent = new File(uriParent);


        System.out.println(parent.listFiles());

        File[] subdirectorios = new File(uriParent).listFiles();


        for(File directorio : subdirectorios){

            if (directorio.isFile()) {
                System.out.println(directorio.getName());
            } else if (directorio.isDirectory()) {
                System.out.println(directorio.length());
                llenarEspacios(directorio.getAbsolutePath(), 'D');
            }
        }



    }

    private static void llenarEspacios(String directorioPadre, char simbolo){
        System.out.print("[" + simbolo + "]");

        for (int i = 0; i < directorioPadre.length(); i++) {
            System.out.print("-");
        }
    }
}
