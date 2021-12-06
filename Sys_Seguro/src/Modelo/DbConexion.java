//Clase para crear la conexion con la DB y ejecutar las consultas desde el sistema
//Randy Marmol
//Ultima Mod: 5 dic 2021

package Modelo;


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.PreparedStatement;

public class DbConexion {

    private final String base = "db_ars";
    private final String url = "jdbc:mysql://localhost:3306/"+base;
    private final String user = "root";
    private final String password = "123456";
   
    private Connection Conexion = null;

    public Connection getConexion() {

        try { //Excepcion 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conexion = (Connection) DriverManager.getConnection(url, user, password);
           

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {

            Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, ex);
        }//fin excepcion

        return Conexion;
    }

}
