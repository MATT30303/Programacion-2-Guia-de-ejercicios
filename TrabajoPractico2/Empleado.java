package TrabajoPractico2;

public class Empleado implements Comparable<Empleado> {

    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Empleado otro) {
        return this.edad - otro.edad;
    }



    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
