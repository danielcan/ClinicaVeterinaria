/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;

import ceutec.controlador.Conexion;
import ceutec.entidad.ECirugias;

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
public class FCirugias {
     public void agregarCirugias(Conexion conn, ECirugias ecir) {
        try {
            PreparedStatement cst = null;
            String s = "call P_iCirugias(?,?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setString(1, ecir.getCirDuracion());
            cst.setString(2, ecir.getCirDescripcion());
            cst.setString(3, ecir.getCirRiesgo());
            cst.setString(4, ecir.getCirNombre());
            cst.setInt(5, ecir.getCirAnestesia());
            
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarCirugias(Conexion conn, ECirugias ecir) {
        try {
            PreparedStatement cst = null;
            String s = "call uCirugias(?,?,?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, ecir.getCirCodigo());
           cst.setString(2, ecir.getCirDuracion());
            cst.setString(3, ecir.getCirDescripcion());
            cst.setString(4, ecir.getCirRiesgo());
            cst.setString(5, ecir.getCirNombre());
            cst.setInt(6, ecir.getCirAnestesia());
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarCirugias(Conexion conn, int circodigo) {
        try {
            PreparedStatement cst = null;
            String s = "call eCirugias(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, circodigo);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

  
    
    public void enlistarCirugias(Conexion conn,JTable tabla) {

      DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"Codigo","Duracion","Descripcion","Riesgo","Nombre","anestecia"};
        model =  new DefaultTableModel(null,columnas);
        String sql = "select * from tblcirugias";
            String[] filas  = new String[7];
            Statement st ;
            ResultSet rs ;
            
             
        try {
            st = conn.getConnectar().createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            for(int i = 0; i<=6;i++){
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
