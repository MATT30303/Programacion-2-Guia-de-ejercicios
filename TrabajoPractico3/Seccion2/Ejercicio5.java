package TrabajoPractico3.Seccion2;

    import java.util.stream.Stream;

public class Ejercicio5 {

    public static void punto_1() {

        long cantidad = Stream.of(2, 5, 3, 7, 1, 4, 6)
                .filter(s -> s > 3)
                .peek(n -> System.out.println(n))
                .count();

        System.out.println("Cantidad: " + cantidad);
    }
}

