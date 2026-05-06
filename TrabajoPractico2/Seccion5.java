package TrabajoPractico2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sección 5: Ordenamiento Avanzado
 * Objetivo: Definir reglas de ordenamiento naturales y personalizadas para objetos
 * complejos en colecciones.
 */
public class Seccion5 {

    /**
     * Ejercicio 5.1 (Orden natural con Comparable): Crea una clase Empleado que implemente
     * la interfaz Comparable. Sobrescribe el método compareTo() para que los empleados se
     * ordenen según su edad. Agrega varios empleados a una lista y utiliza el método
     * Collections.sort() para ordenarlos según este orden natural.
    */
    public void ejercicio1(){

        List<Empleado> lista = new ArrayList<>();

        lista.add(new Empleado("Marcos", 30));
        lista.add(new Empleado("Daniel", 25));
        lista.add(new Empleado("Maximiliano", 40));
        lista.add(new Empleado("Pedro", 20));

        System.out.println("\nAntes de ordenar: ");

        for (Empleado e : lista) {
            System.out.println(e.getNombre() + " - " + e.getEdad());
        }

        Collections.sort(lista);


        System.out.println("\nDespues de ordenar: ");
    
        for (Empleado e : lista) {
            System.out.println(e.getNombre() + " - " + e.getEdad());
        }


    }
    /**
     * Ejercicio 5.2 (Orden personalizado con Comparator): Crea una clase separada que
     * implemente la interfaz Comparator para la clase Empleado. En el método compare(), define
     * una lógica para ordenar a los empleados alfabéticamente por su nombre en lugar de su edad.
     * Pasa tu lista y esta nueva instancia del comparador al método Collections.sort() para ver
     * cómo la lista adopta este nuevo ordenamiento.
    */
    public void ejercicio2(){

        List<Empleado> lista = new ArrayList<>();

        lista.add(new Empleado("Marcos", 30));
        lista.add(new Empleado("Daniel", 25));
        lista.add(new Empleado("Maximiliano", 40));
        lista.add(new Empleado("Pedro", 20));


        System.out.println("\nAntes de ordenar: ");

        for (Empleado e : lista) {
            System.out.println(e.getNombre() + " - " + e.getEdad());
        }

        Collections.sort(lista, new EmpleadoPorNombre());


        System.out.println("\nDespues de ordenar por nombre: ");

        for (Empleado e : lista) {
            System.out.println(e.getNombre() + " - " + e.getEdad());
        }

    }

}
