package TrabajoPractico4.Seccion1;
public class Ejercicio1_2 {

    public static void ejecutar() {

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Limpieza final");
        }

    }

}