package ejercicio2;

public class Reporte {

    // Método sin retorno
    public void generarEncabezado() {
        System.out.println("=== REPORTE DEL SISTEMA ===");
    }

    // Método con retorno
    public String obtenerCuerpo() {
        return "Este es el cuerpo del reporte.";
    }

    // Ejercicio 2.3 - método con argumentos variables
    public void mostrarSecciones(String... secciones) {

        System.out.println("Secciones del reporte:");

        for (String seccion : secciones) {
            System.out.println("- " + seccion);
        }

        if (secciones.length == 0) {
            System.out.println("No se recibieron secciones.");
        }
    }

    public static void main(String[] args) {

        Reporte reporte = new Reporte();

        reporte.generarEncabezado();

        String cuerpo = reporte.obtenerCuerpo();
        System.out.println(cuerpo);

        // Llamada con argumentos
        reporte.mostrarSecciones("Introducción", "Resultados", "Conclusión");

        // Llamada sin argumentos
        reporte.mostrarSecciones();
    }
}