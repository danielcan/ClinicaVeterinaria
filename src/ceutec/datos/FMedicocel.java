/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;

import ceutec.controlador.Conexion;

import ceutec.entidad.EMedicocel;
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
public class FMedicocel {
     public void agregarMedicocel(Conexion conn, EMedicocel emed) {
        try {
            PreparedStatement cst = null;
            String s = "call P_iMedicocel(?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, emed.getMedcodigo());
            cst.setInt(2, emed.getMedcelular());
            
            
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarMedico(Conexion conn, EMedicocel emed) {
        try {
            PreparedStatement cst = null;
            String s = "call uMedicocel(?,?,?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, emed.getMedcodigo());
            cst.setInt(2, emed.getMedcelular());
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarMedico(Conexion conn, int medcodigo) {
        try {
            PreparedStatement cst = null;
            String s = "call eMedicocel(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, medcodigo);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

  
    
    public void enlistarMedico(Conexion conn,JTable tabla) {

      DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"Codigo","telefono"};
        model =  new DefaultTableModel(null,columnas);
        String sql = "select * from tblmedicocel";
            String[] filas  = new String[5];
            Statement st ;
            ResultSet rs ;
            
             
        try {
            st = conn.getConnectar().createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            for(int i = 0; i<=2;i++){
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
