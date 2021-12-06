/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author adm
 */
public class DbUsuariosConsulta extends DbConexion{
    
    public boolean RegistrarUsuario(DbUsuarios usr) {

        PreparedStatement ps = null;
        Connection Conexion = (Connection) getConexion();

        String sql = "INSERT INTO usuarios (usuario,password,nombre,email,id_tipo) VALUES (?,?,?,?,?)";

        try {
            ps = Conexion.prepareStatement(sql);

            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getEmail());
            ps.setInt(5, usr.getId_Tipo());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(DbUsuariosConsulta.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;

    }//fin del metodo

    /*public int ConsultarUsuario(String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection Conexion = (Connection) getConexion();

        String sql = " SELECT count (idUsuario) FROM usuarios WHERE usuario = ?";

        try {
            ps = Conexion.prepareStatement(sql);

            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {

                return rs.getInt(1);

            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(DbUsuariosConsulta.class.getName()).log(Level.SEVERE, null, ex);

            return 1;

        }

    }//fin del metodo*/
    
    
    public boolean Login (DbUsuarios usr){
        
     PreparedStatement ps = null;
     ResultSet rs = null;
     Connection Conexion = (Connection) getConexion();
     
     String sql = "SELECT idUsuarios, usuario, password,Nombre,id_Tipo FROM usuarios WHERE usuario = ? ";
     
     
         
        try {
            ps = Conexion.prepareStatement(sql);
            
         ps.setString(1, usr.getUsuario());
         rs = ps.executeQuery();
         
         if(rs.next()){
             
             if(usr.getPassword().equals(rs.getString(3))){
                 
                 usr.setId(rs.getInt(1));
                 usr.setNombre(rs.getString(4));
                 usr.setId_Tipo(rs.getInt(5));
                 
                 return true;
                 
             }else{
                 
                 return false;
                 
             }
             
         }
         
          
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DbUsuariosConsulta.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        
        }
        return false;
       
          
          

 
    }//fin del metodo
    
    
    
    
    
    
    
    
    
    
}
