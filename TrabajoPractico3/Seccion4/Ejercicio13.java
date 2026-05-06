package TrabajoPractico3.Seccion4;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio13 {
    
    public static void punto_1() {

        List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> sinDuplicados = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Lista limpia: " + sinDuplicados);


        List<Persona> personas = Arrays.asList(
                new Persona("123", "Juan"),
                new Persona("456", "Ana"),
                new Persona("789", "Luis")
        );

        Map<String, String> mapa = personas.stream()
                .collect(Collectors.toMap(
                        p -> p.getDni(),
                        p -> p.getNombre()
                ));

        System.out.println("Mapa: " + mapa);
    }
}
