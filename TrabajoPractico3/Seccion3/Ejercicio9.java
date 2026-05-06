package TrabajoPractico3.Seccion3;

import java.util.stream.Stream;

public class Ejercicio9 {
    
    public static void punto_1() {

        System.out.println("Orden natural:");
        Stream.of("Juan", "Maria", "Ana", "Pedro", "Luis")
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nOrden por longitud:");
        Stream.of("Juan", "Maria", "Ana", "Pedro", "Luis")
                .sorted((a, b) -> a.length() - b.length())
                .forEach(System.out::println);
    }


}
