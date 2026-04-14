

public class Usuario {

    String nombre;
    int edad;
    String correo;
    int telefono;

    // Constructor por defecto
    public Usuario() {
        System.out.println("Usuario creado sin datos.");
    }

    // Constructor con nombre
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    // Constructor con nombre y edad
    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método sobrecargado
    public void actualizarPerfil(String correo) {
        this.correo = correo;
        System.out.println("Correo actualizado: " + correo);
    }

    // Método sobrecargado
    public void actualizarPerfil(String correo, int telefono) {
        this.correo = correo;
        this.telefono = telefono;
        System.out.println("Correo y teléfono actualizados.");
    }
}