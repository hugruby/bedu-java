package ejemplo1;

import java.io.File;

public class Ejemplo1 {
    public static void main(String[] args) {
        File archivo = new File("/Users/groovy/IdeaProjects/sesion8/src/main/resources/cursos/cursos.txt");
        System.out.println("archivo.getName() = " + archivo.getName());
        System.out.println("archivo.getPath() = " + archivo.getPath());
        System.out.println("archivo.getAbsolutePath() = " + archivo.getAbsolutePath());
        System.out.println("archivo.getParent() = " + archivo.getParent());
        System.out.println("archivo.exists() = " + archivo.exists());
        System.out.println("Archivo oculto = " + archivo.isHidden());

        if (archivo.exists()){
            System.out.println("Archivo escribible = " + archivo.canWrite());
            System.out.println("Arcivo Leible = " + archivo.canRead());
            System.out.println("Archivo Ejecutable = " + archivo.canExecute());
            System.out.println("Carpeta = " + archivo.isDirectory());
            System.out.println("Tamaño = " + archivo.length());
        }
    }
}
