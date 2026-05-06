package TrabajoPractico3.Seccion1;
    import java.util.ArrayList;
    import java.util.List;

public class Ejercicio2 {


    public static void punto_1() {


        List<String> textos = new ArrayList<>();
        textos.add("Hola");
        textos.add("Programación");
        textos.add("Java");
        textos.add("Lambda");
        textos.add("AI");


        textos.sort((a, b) -> a.length() - b.length());


        System.out.println(textos);
    }
}

