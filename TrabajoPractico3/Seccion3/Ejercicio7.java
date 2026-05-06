package TrabajoPractico3.Seccion3;

import java.util.stream.Stream;

public class Ejercicio7 {
    
    public static void punto_1() {

        int suma = Stream.of("Juan", "Maria", "Ana")
                .mapToInt(s -> s.length())
                .sum();

        System.out.println("Suma total de letras: " + suma);
    }
}