package TrabajoPractico2;

import java.util.HashSet;
import java.util.ArrayDeque;

/**
 * Sección 3: Conjuntos (Sets) y Colecciones Deque
 * Objetivo: Manipular colecciones sin duplicados y colas de doble extremo.
 */
public class Seccion3 {

    /**
     * Ejercicio 3.1 (Unicidad en Sets): Instancia un HashSet de tipo Integer. Utiliza el método
     * add() para intentar insertar el mismo número tres veces y verifica usando el método size()
     * que solo se almacenó una vez. Comprueba si un número existe usando contains() y elimínalo
     * usando remove(). Observa al imprimir el conjunto que no se garantiza ningún orden de los
     * elementos
     */
    public void ejercicio1(){
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(11);
        hashSet.add(11);
        hashSet.add(11);

        int tamaño = hashSet.size();
        System.out.println("El tamaño del Set es: " + tamaño);

        hashSet.add(67);
        if (!hashSet.contains(67)) {
            System.out.println("67 No esta en hashSet");
        } else {
            System.out.println("67 Si esta en hashSet");
        }

        hashSet.remove(67);

        System.out.println("Contenido del Hash Set: " + hashSet);
    }


    /**
     * Ejercicio 3.2 (Colas de doble extremo con ArrayDeque): Crea una colección ArrayDeque.
     * Utilízala agregando elementos tanto al inicio como al final usando los métodos addFirst() y
     * addLast(). Luego, recupera y elimina los elementos de los extremos utilizando removeFirst()
     * y removeLast().
     */
    public void ejercicio2(){

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addFirst(2);

        deque.addLast(3);
        deque.addLast(4);

        System.out.println("Contenido de la Coleccion: " + deque);

        int primerValor = deque.getFirst();
        int ultimoValor = deque.getLast();

        System.out.println("Primer Valor de la coleccion: " + primerValor);
        System.out.println("Ultimo Valor de la coleccion: " + ultimoValor);

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Contenido final de la Coleccion: " + deque);
    }
}
