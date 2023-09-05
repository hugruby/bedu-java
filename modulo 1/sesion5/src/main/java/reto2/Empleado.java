package reto2;

import java.time.LocalDate;

public class Empleado extends Persona {
    private float salario;

    public float getSalario() {
        return salario;
    }




    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
        super(nombre, edad, fechaNacimiento);
        this.salario = salario;
    }
}
