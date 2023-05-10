package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Héctor Sifuentes
 */
public class Ctrl_Usuario {

    //metodo para Iniciar_Sesion
    public boolean loginUser(Usuario objeto) {

        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "select usuario, password from tb_Usuario where usuario = '" + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "'";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión ");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión ");
        }
        return respuesta;
    }
}
