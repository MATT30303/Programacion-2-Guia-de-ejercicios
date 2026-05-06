package TrabajoPractico4.Seccion1;

public class Ejercicio1_1 {

    public static void ejecutar() {

        try {
            int numero = Integer.parseInt("abc");
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Mensaje del error: " + e.getMessage());
            System.out.println("Tipo de excepcion: " + e.getClass().getName());
        }

    }

}

