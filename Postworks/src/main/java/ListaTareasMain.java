import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaTareasMain {
    private Lector lector = new Lector();


    public static void main(String[] args) {
        byte opcionSeleccionada = 0;
        ListaTareas listaTareas = new ListaTareas("TAREAS MENU");
        System.out.println("\n1.-Crear nueva lista de tareas\n" +
                        "2.-Ver listas de tareas\n" +
                        "3.-Ver tareas de lista\n" +
                        "4.-Actualizar lista de tareas.\n" +
                        "5.-Eliminar lista de tareas\n" +
                        "Para salir favor de poner el número 0");

        try {
            Lector lector = new Lector();
            do{
                opcionSeleccionada  = lector.leeOpcion();
                System.out.print("Dame una opción del listado");
                if (opcionSeleccionada == 0 ) {
                    break;
                }
                    System.out.println("\n\nLa opción seleccionada es: " + opcionSeleccionada);
                    switch (opcionSeleccionada) {
                        case 1:
                            listaTareas.crearNuevaLista();
                            break;
                        case 2:
                            listaTareas.verListaTareas();
                            break;
                        case 3:
                            listaTareas.verTareasDeLista();
                            break;
                        case 4:
                            listaTareas.actualizarListaDeTareas();
                            break;
                        case 5:
                            listaTareas.eliminarListaDeTareas();
                            break;
                        default:
                            System.out.println("Opción desconocida");
                    }
            }while(opcionSeleccionada != -1);
        }catch (NumberFormatException e) {
            System.out.println("Error al convertir la cadena en entero: " + e.getMessage());
        }catch(InputMismatchException ime){
            System.out.println("Favor de colocar una opción válida usando un numeral");
        }
    }
}
