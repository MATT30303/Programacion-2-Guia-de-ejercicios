package TrabajoPractico1;

public class Reporte {
    
    public void generarEncabezado(){
        System.out.println("Encabezado del reporte");
    }

    public String obtenerCuerpo(){
        return "cuerpo del reporte generado correctamente";
    }

    public void mostrarSecciones(String... secciones){
        if (secciones.length == 0) {
            System.out.println("No hay secciones para mostrar.");
            return;
        }

        for (String seccion : secciones) {
            System.out.println(seccion);
        }
    }
}
