package controlador;

import conexion.Conexion;
import modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Héctor Sifuentes
 */
public class Ctrl_Categoria {
    //metodo para registrar categoria

    public boolean guardar(Categoria objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_Categoria values (?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar categoría: " + e);
        }

        return respuesta;
    }

    //metodo para consultar la existencia de la categoria
    public boolean existeCategoria(String Categoria) {
        boolean respuesta = false;

        String sql = "select descripcion from tb_Categoria where descripcion = '" + Categoria + "';";
        Statement st;

        try {

            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar categoría: " + e);
        }
        return respuesta;
    }
    
     //metodo para Actualizar categoria
    public boolean actualizar(Categoria objeto, int Id_Categoria) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_Categoria set descripcion=? where Id_Categoria='" + Id_Categoria +"'");
            consulta.setString(1, objeto.getDescripcion());           

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar categoría: " + e);
        }

        return respuesta;
    }

     //metodo para Eliminar categoria
    public boolean eliminar(int Id_Categoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_Categoria where Id_Categoria='" + Id_Categoria +"'");
            consulta.executeUpdate();           

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar categoría: " + e);
        }

        return respuesta;
    }
}
