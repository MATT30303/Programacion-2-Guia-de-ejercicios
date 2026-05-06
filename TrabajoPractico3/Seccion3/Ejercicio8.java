package TrabajoPractico3.Seccion3;

import java.util.List;


public class Ejercicio8 {
    
    public static void punto_1() {

        List<List<String>> datos = List.of(
                List.of("Juan", "Maria"),
                List.of("Ana", "Pedro"),
                List.of("Luis", "Carolina")
        );

        long cantidad = datos.stream()
                .flatMap(l -> l.stream())
                .filter(nombre -> nombre.length() > 4)
                .count();

        System.out.println("Cantidad: " + cantidad);
    }
}