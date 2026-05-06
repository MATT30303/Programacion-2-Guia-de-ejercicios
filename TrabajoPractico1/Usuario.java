package TrabajoPractico1;

public class Usuario {
    private String nombre;
    private String correo;
    private int edad;
    private int telefono;


    public Usuario(){
        this.nombre = "Sin Nombre";
        this.correo = "Sin correo electronico";
        this.edad = -1;
        this.telefono = -1;
    }

    public Usuario(String nombre){
        this.nombre = nombre;
        this.correo = "Sin correo electronico";
        this.edad = -1;
        this.telefono = -1;
    }

    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.correo = "Sin correo electronico";
        this.edad = edad;
        this.telefono = -1;
    }


    public void actualizarCorreo(String correo){
        this.correo = correo;
    }

    public void actualizarCorreo(String correo, int telefono){
        this.correo = correo;
        this.telefono = telefono;
    }
}
