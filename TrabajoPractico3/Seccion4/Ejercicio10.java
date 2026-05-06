package TrabajoPractico3.Seccion4;

import java.util.stream.Stream;

public class Ejercicio10 {

    public static void punto_1() {

        boolean hayMayorA5 = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .anyMatch(n -> n > 5);

        boolean todosMayoresA1 = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .allMatch(n -> n > 1);

        boolean ningunoMayorA10 = Stream.of(2, 5, 7, 3, 6, 2, 3)
                .noneMatch(n -> n > 10);

        System.out.println("¿Hay alguno > 5? " + hayMayorA5);
        System.out.println("¿Todos > 1? " + todosMayoresA1);
        System.out.println("¿Ninguno > 10? " + ningunoMayorA10);
    }
}
