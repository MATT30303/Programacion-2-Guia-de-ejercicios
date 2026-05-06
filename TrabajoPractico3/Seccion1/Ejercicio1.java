package TrabajoPractico3.Seccion1;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Ejercicio1 {
    /** 
     * Crea un Predicate<Integer> que devuelva
     * true si un número es par (usando su método test). 
    */
    public void punto_1() {

        Predicate<Integer> esPar = numero -> numero % 2 == 0;

        int valor = 4;
        boolean resultado = esPar.test(valor);

        System.out.println("¿" + valor + " es par? " + resultado);
    }


/**
 * Crea una Function<String, Integer> que tome una cadena de texto y 
 * devuelva su longitud (usando su método apply).
 */
    public void punto_2() {

        Function<String, Integer> longitud = texto -> texto.length();

        String palabra = "Hola mundo";
        int resultado = longitud.apply(palabra);

        System.out.println("La longitud de \"" + palabra + "\" es: " + resultado);
    }


    /**
     * Crea un Consumer<Integer> que imprima el número
     *  recibido por consola (usando su método accept).
     */
    public void punto_3() {

        Consumer<Integer> imprimir = numero -> System.out.println("Número: " + numero);

        imprimir.accept(10);
    }

/**
 * Crea un Supplier<Double> que devuelva un número
 * aleatorio usando Math.random() (usando su método get). 
 */
    public void punto_4() {

        Supplier<Double> aleatorio = () -> Math.random();

        double valor = aleatorio.get();

        System.out.println("Número aleatorio: " + valor);
    }
}
