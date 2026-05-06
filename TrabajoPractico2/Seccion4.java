package TrabajoPractico2;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Sección 4: Mapas (Maps)
 * Objetivo: Trabajar con asociaciones de clave-valor utilizando diferentes
 * implementaciones del framework de mapas.
 */
public class Seccion4 {

    /**
     * Ejercicio 4.1 (Manejo de HashMap): Crea un HashMap que asocie identificadores de
     * usuario (tipo Integer) con sus nombres (tipo String). Utiliza el método put() para agregar
     * nuevas entradas. Recupera un nombre pasando su identificador al método get(), y actualiza
     * un nombre existente empleando el método replace(). Finalmente, utiliza remove() pasando la
     * clave para eliminar un registro.
     */
    public void ejercicio1(){
        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(0, "Marcos");
        mapa.put(1, "Daniel");
        mapa.put(2, "Maximiliano");

        System.out.println("Contenido del Mapa: " + mapa);

        String seleccionado = mapa.get(1);
        System.out.println("El usuario seleccionado es: " + seleccionado);

        mapa.replace(0, "Pedro");
        System.out.println("Contenido actualizado: " + mapa);

        mapa.remove(2);
        System.out.println("Contenido final: " + mapa);
    }


    /**
     * Ejercicio 4.2 (Ordenamiento con TreeMap): Repite el ejercicio anterior, pero esta vez
     * instancia un TreeMap. Utiliza el método keySet() para obtener todas las claves y recórrelas.
     * Observa cómo el TreeMap recupera los registros automáticamente ordenados de forma
     * ascendente según el orden natural de sus claves.
     */
    public void ejercicio2(){
        TreeMap<Integer, String> mapa = new TreeMap<>();

        mapa.put(2, "Maximiliano");
        mapa.put(0, "Marcos");
        mapa.put(1, "Daniel");

        System.out.println("Contenido del TreeMap: " + mapa);

        for (Integer clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + " || Valor: " + mapa.get(clave));
        }
    }
}


