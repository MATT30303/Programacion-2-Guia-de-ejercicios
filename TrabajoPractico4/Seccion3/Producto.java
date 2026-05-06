package TrabajoPractico4.Seccion3;

public class Producto {

    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {

        if (precio <= 0) {
            throw new ProductoInvalidoException("El precio del producto debe ser mayor que 0.");
        }

        this.nombre = nombre;
        this.precio = precio;

        System.out.println("Producto creado: " + nombre + " - $" + precio);
    }

}