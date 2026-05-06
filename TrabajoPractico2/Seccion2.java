package TrabajoPractico2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Sección 2: Listas (Lists)
 * Objetivo: Comprender las colecciones ordenadas que permiten duplicados y el uso de
 * implementaciones dinámicas
*/

public class Seccion2 {
    
    /**
     * Ejercicio 2.1 (Operaciones CRUD en ArrayList): Crea un ArrayList de tipo String, el cual
     * está respaldado por un arreglo dinámico. Utiliza el método add() para agregar tres
     * elementos, set() para actualizar el valor del segundo elemento, get() para recuperar el primer
     * valor y remove() para eliminar el último.
    */
    public void ejercicio1(){

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Marcos");
        lista.add("Pablo");
        lista.add("Jose");

        System.out.println("Antes de modificar: " + lista);

        lista.set(1, "Alex");

        String primero = lista.get(0);
        System.out.println("Primer elemento: " + primero);

        lista.remove(2);

        System.out.println("Despues de modificar: " + lista);

    }


    /**
     * Ejercicio 2.2 (Listas Inmutables vs LinkedList): Utiliza el método de fábrica List.of()
     * para crear una lista inmutable con varios valores predefinidos. Intenta agregar un nuevo
     * elemento para observar cómo se lanza una UnsupportedOperationException. Luego, pasa esa
     * lista al constructor de un LinkedList para crear una lista mutable y realiza inserciones en el
     * medio de la lista, aprovechando que esta implementación de lista doblemente enlazada es
     * eficiente para esas operaciones.
    */
    public void ejercicio2(){

        List<String> listaInmutable = List.of("lourdes", "Zoe", "Noelia");

        //listaInmutable.add("Martina");

        LinkedList<String> listaEnlazada = new LinkedList<>(listaInmutable);

        listaEnlazada.add(1 ,"Martina");
        listaEnlazada.add(2 ,"Maia");

        System.out.println(listaEnlazada);
    }


}
