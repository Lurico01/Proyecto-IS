package modelo;

/**
 *
 * @author Héctor Sifuentes
 */
public class Producto {
    
    //Atributos
    private int Id_Producto;
    private String nombre;
    private int Id_Proveedor;
    private int cantidad;
    private double precio;
    private String descripcion;
    private int porcentajeIva;
    private int Id_Categoria;
    private int estado;
    
    //Constructor vacio
    public Producto(){
        this.Id_Producto = 0;
        this.nombre = "";
        this.Id_Proveedor = 0;
        this.cantidad = 0;
        this.precio = 0.0;
        this.descripcion = "";
        this.porcentajeIva = 0;
        this.Id_Categoria = 0;
        this.estado = 0;
    }
    
    //Constructor sobrecargado
    public Producto(int Id_Producto, String nombre, int Id_Proveedor, int cantidad, double precio, String descripcion, int porcentajeIva, int Id_Categoria, int estado) {
        this.Id_Producto = Id_Producto;
        this.nombre = nombre;
        this.Id_Proveedor = Id_Proveedor;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.porcentajeIva = porcentajeIva;
        this.Id_Categoria = Id_Categoria;
        this.estado = estado;
    }
    
    
    //Getter and setter

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_Proveedor() {
        return Id_Proveedor;
    }

    public void setId_Proveedor(int Id_Proveedor) {
        this.Id_Proveedor = Id_Proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(int porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public int getId_Categoria() {
        return Id_Categoria;
    }

    public void setId_Categoria(int Id_Categoria) {
        this.Id_Categoria = Id_Categoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
