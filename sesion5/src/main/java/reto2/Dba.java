package reto2;

import java.time.LocalDate;

public class Dba extends Empleado{

    private String herramientasConsultas;
    public Dba(String name, byte edad, LocalDate fechaNacimiento, float salario, String herramientasConsultas) {
        super(name, edad, fechaNacimiento, salario);
        this.herramientasConsultas = herramientasConsultas;
    }

    public String getHerramientasConsultas() {
        return herramientasConsultas;
    }

    public void setHerramientasConsultas(String herramientasConsultas) {
        this.herramientasConsultas = herramientasConsultas;
    }
}
