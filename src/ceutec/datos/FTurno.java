/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;

import ceutec.controlador.Conexion;
import ceutec.entidad.ETurno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author PC-lite
 */
public class FTurno {
     public void agregarTurno(Conexion conn, ETurno eturn) {
        try {
            PreparedStatement cst = null;
            String s = "call P_iTurno(?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setString(1, eturn.getTurNombre());
            cst.setString(2, eturn.getTurHoraIni());
            cst.setString(3, eturn.getTurHoraFin());
          
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarTurno(Conexion conn, ETurno eturn) {
        try {
            PreparedStatement cst = null;
            String s = "call uTurno(?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, eturn.getTurCodigo());
            cst.setString(2, eturn.getTurNombre());
            cst.setString(3, eturn.getTurHoraIni());
            cst.setString(4, eturn.getTurHoraFin());
            
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarTurno(Conexion conn, int turcodigo) {
        try {
            PreparedStatement cst = null;
            String s = "call eTurno(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, turcodigo);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void enlistarTurno(Conexion conn) {

     
        String sql = "select * from tblturno";
            String[] filas  = new String[5];
            Statement st;
            ResultSet rs;
            
        try {
            st = conn.getConnectar().createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            for(int i = 0; i<=4;i++){
                filas[i] = rs.getString(i+1);
                System.out.println(filas[i]);
                }
            }
        } catch (SQLException ex) {
          //  System.out.println("Error: " + ex.getMessage());
          JOptionPane.showMessageDialog(null,"No se puede listar la tabla");
        }
    }
}
