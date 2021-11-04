/*
 * Class to conexion database oracle
 * create to daniel canales
 */
package ceutec.controlador;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

//import java.sql.ResultSet;
//import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author PC-lite
 */
public class Conexion {
   
    private static Connection conn = null;
    private static String login = "CLINICA1";
    private static String clave = "12345";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";

   
    /*
    *
    */
     public void desconexion() {
       try{
           conn.close();
       }catch(SQLException e){
           System.out.println("Error al desconectar" + e.getMessage());
       }
    }
    
    /**
     *
     * @return
     */
    public Connection getConnectar(){
        try{
             Class.forName("oracle.jdbc.driver.OracleDriver");    
             conn = DriverManager.getConnection(url, login, clave);
             conn.setAutoCommit(false);
             if(conn != null){
                 System.out.println("Conexion Exitosa");
             }else{
                 System.out.println("Conexion es erronea");
             }
        }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null," Conexion Erronea " + e.getMessage());
        }
        return conn;
    }
 
}
