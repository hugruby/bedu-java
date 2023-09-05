public class Vehiculo {

    private Llantas[] llantas = new Llantas[4];
    private Combustible combustible;

    public Vehiculo(Llantas[] llantas) {
        this.llantas = llantas;
        this.combustible = combustible;
    }

    public void colocaLlantas(Llantas delanteraIzquierda, Llantas delanteraDerecha, Llantas traseraIzquierda, Llantas traseraDerecha) {
        llantas[0] = delanteraIzquierda;
        llantas[1] = delanteraDerecha;
        llantas[2] = traseraIzquierda;
        llantas[3] = traseraDerecha;
    }

    public void colocarCombustible(Combustible combustible, int litros){
        combustible.setLitrosActuales(litros);
        System.out.println("Poniendole combustible al auto.");
    }

    public void llenaTanque() {
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }

    public void avanzar(){
        if(this.combustible.getLitrosActuales() <= 0){
            System.out.println("El Auto no puede avanzar");
        }else{

        }

    }

    public static void main(String[] args) {


    }
}

    /*El vehículo debe tener la capacidad de que se le coloquen las cuatro llantas y el combustible, además de avanzar
    (rodando las llantas y usando el combustible), sino hay combustible el auto no debe poder avanzar.
        Todos los atributos de todas las clases deben poder leerse y escribirse con métodos de la clase (getter y setter).
        En el método main haz uso del vehículo para avanzar al menos 10 kilómetros.*/


class Llantas{
    private int ancho, presión, diámetro;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPresión() {
        return presión;
    }

    public void setPresión(int presión) {
        this.presión = presión;
    }

    public int getDiámetro() {
        return diámetro;
    }

    public void setDiámetro(int diámetro) {
        this.diámetro = diámetro;
    }

    public void rodar(){
        System.out.println("Las llantas estan rodando");
    }
}

class Combustible{


    private int litrosMaximos;
    private int litrosActuales;

    public Combustible(int litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }
    public int getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosMaximos(int litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public int getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(int litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    public int usoVehiculo(){
        System.out.println(--this.litrosActuales);
        return (this.litrosActuales);
    }
}