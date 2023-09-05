package reto2;

import java.io.*;

public class Reto2 {
        public static void main(String[] args) {
            try {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/groovy/IdeaProjects/sesion8/src/main/resources/beto.png"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/groovy/IdeaProjects/sesion8/src/main/resources/beto_copia.png"));
                byte[] buffer = new byte[1024];
                int bytesLeidos = 0;
                while ((bytesLeidos = bis.read(buffer)) > 0){
                    System.out.println(bytesLeidos);
                    bos.write(buffer, 0, bytesLeidos);
                    bos.flush();
                }
                bis.close();
                bos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
