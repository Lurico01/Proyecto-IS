package modelo;

/**
 *
 * @author Héctor Sifuentes
 */
public class Categoria {
        //Atributos
    private int Id_categoria;
    private String descripcion;
    private int estado;
        //Constructor vacio
    public Categoria() {
        this.Id_categoria = 0;
        this.descripcion = "";
        this.estado = 0;
    }
    
    //Constructor sobrecargado
    public Categoria(int Id_categoria, String descripcion, int estado) {
        this.Id_categoria = Id_categoria;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
            //set and get
    public int getId_categoria() {
        return Id_categoria;
    }

    public void setId_categoria(int Id_categoria) {
        this.Id_categoria = Id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
