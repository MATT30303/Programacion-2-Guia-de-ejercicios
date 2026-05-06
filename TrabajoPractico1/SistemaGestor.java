package TrabajoPractico1;

/**
 * La clase SistemaGestor representa un sistema basico de gestion.
 * Tiene atributos simples para demostrar el uso de comentarios en Java.
 */
public class SistemaGestor {

    // Variable que almacena el nombre del sistema
    private String nombreSistema;

    // Variable que almacena la cantidad de usuarios
    private int cantidadUsuarios;

    // Número máximo de conexiones permitidas en el sistema
    public static final int MAX_CONEXIONES = 10;

    /*
    Aquí se inicializan valores por defecto al crear el objeto.
    */
    public SistemaGestor() {
        this.nombreSistema = "Sistema de Gestión";
        this.cantidadUsuarios = 0;
    }


    /*
    MAX_CONEXIONES pertenece a la clase porque es static,
    es decir, no depende de una instancia del objeto y existe una sola copia.
    Además, es final, por lo que su valor no puede ser reasignado
    después de su inicialización (siempre será 10).
    */
    public static void mostrarConexiones(){
        System.out.println(MAX_CONEXIONES);
    }

    // Método para obtener el nombre del sistema
    public String getNombreSistema() {
        return nombreSistema;
    }

    // Metodo para obtener la cantidad de usuarios
    public int getCantidadUsuarios() {
        return cantidadUsuarios;
    }
}