package TrabajoPractico4.Seccion2;

public class Ejercicio2_1 {

    public static void registrarUsuario(String nombre, int edad) {

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }

        System.out.println("Usuario registrado: " + nombre + " - Edad: " + edad);
    }

}