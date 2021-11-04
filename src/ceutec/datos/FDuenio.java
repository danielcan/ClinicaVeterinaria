/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;

import ceutec.controlador.Conexion;
import ceutec.entidad.EDuenio;
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
public class FDuenio {

    public FDuenio() {
    }
    
 
      public void agregarDuenio(Conexion conn, EDuenio due) {
        try {
            PreparedStatement cst = null;
            String s = "call P_iduenio(?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setString(1, due.getDuenombre());
            cst.setString(2, due.getDueIdentidad());
            cst.setString(3, due.getDueDireccion());
            cst.setInt(4, due.getDueTelefono());
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarDuenio(Conexion conn, EDuenio due) {
        try {
            PreparedStatement cst = null;
            String s = "call uDuenio(?,?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, due.getDuecodigo());
            cst.setString(2, due.getDuenombre());
            cst.setString(3, due.getDueIdentidad());
            cst.setString(4, due.getDueDireccion());
            cst.setInt(5, due.getDueTelefono());
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarDuenio(Conexion conn, int duecodigo) {
        try {
            PreparedStatement cst = null;
            String s = "call eDuenio(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, duecodigo);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
 public void enlistar(Conexion conn,JTable tabla) {

      DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"Codigo","nombre","identidad","direccion","telefono"};
        model =  new DefaultTableModel(null,columnas);
        String sql = "select * from TBLDuenio";
            String[] filas  = new String[5];
            Statement st = null;
            ResultSet rs = null;
            
             
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
