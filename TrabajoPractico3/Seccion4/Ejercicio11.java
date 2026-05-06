package TrabajoPractico3.Seccion4;

import java.util.Optional;
import java.util.stream.Stream;

public class Ejercicio11 {

    public static void punto_1() {

        Optional<Integer> resultado = Stream.of(1, 3, 5, 6, 7)
                .filter(n -> n % 2 == 0)
                .findFirst();

        if (resultado.isPresent()) {
            System.out.println("Número encontrado: " + resultado.get());
        } else {
            System.out.println("No se encontró ningún número par");
        }
    }
}