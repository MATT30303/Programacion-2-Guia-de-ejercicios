package TrabajoPractico4;
import TrabajoPractico4.Seccion1.Ejercicio1_1;
import TrabajoPractico4.Seccion1.Ejercicio1_2;
import TrabajoPractico4.Seccion1.Ejercicio1_3;
import TrabajoPractico4.Seccion2.Ejercicio2_1;
import TrabajoPractico4.Seccion3.CuentaBancaria;
import TrabajoPractico4.Seccion3.Producto;
import TrabajoPractico4.Seccion3.SaldoInsuficienteException;
import TrabajoPractico4.Seccion4.Ejercicio4_1;

public class App {

    public static void main(String[] args) {

        System.out.println("=== Seccion 1 ===");

        Ejercicio1_1.ejecutar();
        Ejercicio1_2.ejecutar();
        Ejercicio1_3.ejecutar("abc");


        System.out.println("\n=== Seccion 2 ===");

        try {
            Ejercicio2_1.registrarUsuario("Matt", 21);
            Ejercicio2_1.registrarUsuario("", 21);
            Ejercicio2_1.registrarUsuario("Juan", -5);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

         System.out.println("=== Seccion 3 ===");

        // EJERCICIO 3.1
        CuentaBancaria cuenta = new CuentaBancaria(100);

        try {
            cuenta.retirar(150);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // EJERCICIO 3.2
        try {
            Producto p = new Producto("Mouse Gamer", -50);
        } catch (Exception e) {
            System.out.println("Error al crear producto: " + e.getMessage());
        }


        System.out.println("=== Seccion 4 ===");

        Ejercicio4_1.leerArchivo();
    }

}