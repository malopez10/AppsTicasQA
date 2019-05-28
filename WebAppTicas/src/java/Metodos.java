/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class Metodos {
    String db = "appticas";  //Nombre de la base de datos
    String url = "jdbc:mysql://localhost:3306/" + db;
    String user = "root";  //Usuario de MySql
    String pass = "Manuel10.";  //Password de entrada
    //DefaultTableModel modelo;
    String sSQL = "";

    public Connection conectar() {

        //Se crea una conexión llamada LINK
        Connection link = null;
        try {
            //Se le pasan los datos de coneccion a la variable LINK
            link = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) //Se guarda el mensaje de error (en caso de existir) en la variable EX
        {
            //Se muestra el mensaje de error guardado en la variable EX
            JOptionPane.showMessageDialog(null, ex);
        }
        return link;
    }
    
    public boolean CalificarApp(int idUsuario, int idApp, int Calificacion) {
        Connection con = conectar();
        
        sSQL = "insert into calificacion (puntacion,id_usu,id_app) values ("+Calificacion+","+idUsuario+","+idApp+");";
       
        try {
            Statement st = (Statement) con.createStatement();
            st.executeUpdate(sSQL);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }
    
    public boolean ListarApps(int desarrollador, int categoria) {
        Connection con = conectar();

        sSQL = "select a.nombre, a.descripcion, c.nombre from app a inner join categoria c on (a.categoria = c.id_cat) where a.categoria="+categoria+" or a.desarrollador="+desarrollador+";";

            
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet r = st.executeQuery(sSQL);
            while(r.next()){
                System.out.println (r.getString(1));
                System.out.println (r.getString(2));
                System.out.println (r.getString(3));
            }
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
        
    }
}
