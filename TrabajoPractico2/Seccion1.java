package TrabajoPractico2;

import java.util.Arrays;

/**
 * Sección 1: Matrices (Arrays)
 * Objetivo: Practicar la creación, inicialización, actualización y ordenamiento de arreglos
 * de tamaño fijo.
 */
public class Seccion1 {


/** 
 * Ejercicio 1.1 (Creación, actualización y recuperación): Crea un arreglo (matriz) de
 * enteros especificando un tamaño de 5 elementos utilizando la palabra clave new. Asigna
 * valores a cada posición usando el índice correspondiente. Actualiza el valor del tercer
 * elemento y luego recupera el último elemento utilizando el atributo length para calcular su
 * índice.
*/
    public void ejercicio1(){
        int[] arreglo = new int[5];

        arreglo[0] = 0;
        arreglo[1] = 1;
        arreglo[2] = 6;
        arreglo[3] = 3;
        arreglo[4] = 4;

        arreglo[2] = 2;

        int ultimo = arreglo[arreglo.length - 1];
        System.out.println("Valor del ultimo indice del arreglo: " + ultimo);
    }


/** 
 * Ejercicio 1.2 (Ordenamiento y Búsqueda): Crea un arreglo de tipo String con nombres
 * desordenados. Utiliza el método estático Arrays.sort() para ordenar los elementos del arreglo
 * en orden ascendente. Una vez ordenado, utiliza el método Arrays.binarySearch() para buscar
 * la posición de un nombre específico dentro del arreglo.
*/
    public void ejercicio2(){
        String[] arregloCadena = new String[5];

        arregloCadena[0] = "Maria";
        arregloCadena[1] = "Ariel";
        arregloCadena[2] = "Lourdes";
        arregloCadena[3] = "Carlos";
        arregloCadena[4] = "Ignacio";

        Arrays.sort(arregloCadena);
        int busqueda = Arrays.binarySearch(arregloCadena, "Lourdes");

        System.out.println("Resultado de la Busqueda: " + busqueda);
    }

}
