package TrabajoPractico4.Seccion1;
public class Ejercicio1_3 {

    public static void ejecutar(String valor) {

        try {
            int numero = Integer.parseInt(valor);
            int resultado = 100 / numero;

            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error de cálculo o conversión");
        }

    }

}