package TrabajoPractico1;

// Para compilar: javac TrabajoPractico1/App.java
// para ejecutar: java TrabajoPractico1/App


public class App {
    
    public static void main(String[] args) {

        Reporte reporte = new Reporte();
        
        reporte.mostrarSecciones("Introducción", "Desarrollo", "Conclusión");

        reporte.mostrarSecciones();
    }
}