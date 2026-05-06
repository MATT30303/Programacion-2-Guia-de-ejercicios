package TrabajoPractico3.Seccion4;

import java.util.Optional;
import java.util.stream.Stream;

public class Ejercicio12 {

    public static void punto_1() {

        Optional<Integer> resultado = Stream.of(2, 5, 3, 6)
                .reduce((a, b) -> a + b);

        if (resultado.isPresent()) {
            System.out.println("Suma total: " + resultado.get());
        }
    }
}
