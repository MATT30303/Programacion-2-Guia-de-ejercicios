package TrabajoPractico3.Seccion1;

import java.util.function.ToIntFunction;
import java.util.function.IntPredicate;

public class Ejercicio3 {

    public static void punto_1(){

        ToIntFunction<String> longitud = texto -> texto.length();

        String palabra = "Hola mundo";
        int resultadoLongitud = longitud.applyAsInt(palabra);

        System.out.println("Longitud: " + resultadoLongitud);



        IntPredicate esPar = numero -> numero % 2 == 0;

        int valor = 4;
        boolean resultadoPar = esPar.test(valor);

        System.out.println("¿" + valor + " es par? " + resultadoPar);
    }
}

