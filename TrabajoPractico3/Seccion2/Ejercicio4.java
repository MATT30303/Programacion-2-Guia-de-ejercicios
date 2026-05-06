package TrabajoPractico3.Seccion2;


import java.util.stream.Stream;

public class Ejercicio4 {

    public static void punto_1() {

        long cantidad = Stream.of(2, 5, 3, 3, 6, 2, 4)
            .distinct()
            .skip(1)
            .limit(3)
            .count();

        System.out.println("Cantidad de elementos: " + cantidad);
    }
}



