import java.io.Console;
import java.util.Scanner;

public class Prework {
    public static void main(String[] args) {
      /*  System.out.println("Dame mumero");
        Scanner sc = new Scanner(System.in);
        int numero  = sc.nextInt();
        System.out.println(numero);*/


        Console console = System.console();
        if (console == null) {
            System.err.println("No hay consola.");
            System.exit(1);
        }else {
            System.out.printf("Dame una cadena");
            String cadena  = console.readLine();
            System.out.println("cadena = " + cadena);
        }


        /*Mascota mascota = new Mascota("firulais", 10, "perro", "Hugo");
        Mascota m1 = new Mascota("Milaneso", 3, "Perro", "Jonh");


        mascota.comer();
        mascota.dormir();

        System.out.println("mascota.getName() = " + mascota.getName());
        System.out.println("mascota.getAge() = " + mascota.getAge());
        System.out.println("mascota.getType() = " + mascota.getType());
        System.out.println("mascota.getOwner() = " + mascota.getOwner());*/
    }
}


class Mascota{

    private String name;
    private int age;
    private String type;
    private String owner;

    public Mascota(String name, int age, String type, String owner) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.owner = owner;
    }
    public void dormir(){
        System.out.println("Durmiendo zzzzzzzzz");
    }
    public void comer(){
        System.out.println("Comiendo ñam, ñam");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}