package TrabajoPractico3.Seccion3;
import java.util.stream.Stream;

public class Ejercicio6 {
    
    public static void punto_1() {

        Stream.of("Juan", "Maria", "Ana")
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }
}