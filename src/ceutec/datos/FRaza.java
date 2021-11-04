/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;

import ceutec.controlador.Conexion;
import ceutec.entidad.ERaza;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC-lite
 */
public class FRaza {
     public void agregarRaza(Conexion conn, ERaza emed) {
        try {
            PreparedStatement cst = null;
            String s = "call P_iRaza(?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setString(1, emed.getRazNombre());
            cst.setInt(2, emed.getEsCodigo());
            cst.setString(3, emed.getRazLogevidad());
           
            
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarMedico(Conexion conn, ERaza emed) {
        try {
            PreparedStatement cst = null;
            String s = "call uRaza(?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, emed.getRazCodigo());
             cst.setString(2, emed.getRazNombre());
            cst.setInt(3, emed.getEsCodigo());
            cst.setString(4, emed.getRazLogevidad());
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarMedico(Conexion conn, int medcodigo) {
        try {
            PreparedStatement cst = null;
            String s = "call eRaza(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, medcodigo);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

  
    
    public void enlistarraza(Conexion conn,JTable tabla) {

      DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"Codigo","nombre","es_codigo","Longevidad"};
        model =  new DefaultTableModel(null,columnas);
        String sql = "select * from tblraza";
            String[] filas  = new String[5];
            Statement st ;
            ResultSet rs;
            
             
        try {
            st = conn.getConnectar().createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            for(int i = 0; i<=4;i++){
                filas[i] = rs.getString(i+1);
                System.out.println(filas[i]);
                }
            model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
          //  System.out.println("Error: " + ex.getMessage());
          JOptionPane.showMessageDialog(null,"No se puede listar en la tabla");
        }
    }
}
