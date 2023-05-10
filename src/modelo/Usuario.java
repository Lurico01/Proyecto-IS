
package modelo;

/**
 *
 * @author Héctor Sifuentes
 */
public class Usuario {
    //Atributos
    private int Id_Usuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String telefono;
    private int estado;
    
    //Constructor
    public Usuario(){
        this.Id_Usuario = 0;
        this.nombre = "";
        this.apellido = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.estado = 0;
    }
    
    //set and get
    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
