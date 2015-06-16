/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.migrana.dap;

import co.edu.uniandes.migrana.util.ToJSON;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.ws.rs.core.Response;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author camilomarroquin
 */
public class UsuarioDataAccess {
    
    public static Connection conn = null;
    
    public static PreparedStatement query = null;
    
    public static ResultSet rs = null;
    
    public static String sql = null;
    
    private static Connection GetConnection(){
        if (conn == null) {
            try{		
                InitialContext ctx = new InitialContext();
                DataSource ds = (DataSource) ctx.lookup("jdbc/UsersDB");	
                conn = ds.getConnection();
            }
            catch (Exception ex){
                System.out.println("Error: error al crear la conección a la base de datos. Detalles: " + ex.toString());
            }
        }
        return conn;
    }
    
    
    public static String GetUsuarios() throws Exception{
        Connection conn = GetConnection();
        ToJSON converter = new ToJSON();
        JSONArray json = new JSONArray();
        String resultado = null;        
        
        sql = "SELECT nombre_usuario, fecha_nacimiento, genero, numero_telefono, numero_identificacion FROM usuario";
        query = conn.prepareStatement(sql);
        rs = query.executeQuery();
        json = converter.toJSONArray(rs);
        resultado = json.toString();
        if (rs != null) 
            rs.close();
        if (query != null) 
            query.close();
        
        return resultado;
    } 
    
    public static String GetUsuariosById(String numeroIdentificacion) throws Exception{
        Connection conn = GetConnection();
        ToJSON converter = new ToJSON();
        JSONArray json = new JSONArray();
        String resultado = null;       
        
        sql = "SELECT nombre_usuario, fecha_nacimiento, genero, numero_telefono, numero_identificacion FROM usuario Where numero_identificacion = ?";
        query = conn.prepareStatement(sql);
        query.setString(1, numeroIdentificacion);
        rs = query.executeQuery();
        json = converter.toJSONArray(rs);
        resultado = json.toString();
        if (rs != null) 
            rs.close();
        if (query != null) 
            query.close();
        
        return resultado;
    } 
    
    public static void insertUser(String incomingData) throws Exception{
        Connection conn = GetConnection();
        JSONObject partsData = new JSONObject(incomingData);
        
        sql = "INSERT into usuario(nombre_usuario, fecha_nacimiento, genero, numero_telefono, numero_identificacion) VALUES(?,'1980-09-05',?,?,?)";
        query = conn.prepareStatement(sql);
        query.setString(1, partsData.optString("nombre_usuario"));
        //query.setDate(2, partsData.optString("fecha_nacimiento"));
        query.setString(2, partsData.optString("genero"));
        query.setString(3, partsData.optString("numero_telefono"));
        query.setString(4, partsData.optString("numero_identificacion"));	         
        query.executeUpdate();	         	         
        if (rs != null) 
            rs.close();
        if (query != null) 
            query.close();                
    }
    
    public static void updateUser(String incomingData) throws Exception{
        Connection conn = GetConnection();                
        JSONObject partsData = new JSONObject(incomingData);
        sql = "UPDATE usuario SET nombre_usuario = ?, genero = ?, numero_telefono = ?  WHERE numero_identificacion = ?";

        query = conn.prepareStatement(sql);
        query.setString(1, partsData.optString("nombre_usuario"));
        //query.setDate(2, partsData.optString("fecha_nacimiento"));
        query.setString(2, partsData.optString("genero"));
        query.setString(3, partsData.optString("numero_telefono"));
        query.setString(4, partsData.optString("numero_identificacion"));	         
        query.executeUpdate();	         	         
        
        if (rs != null) 
            rs.close();
        if (query != null) 
            query.close();
                         
    }    
            
            
    
}
