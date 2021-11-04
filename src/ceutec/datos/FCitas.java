/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;

import ceutec.controlador.Conexion;
import ceutec.entidad.ECitas;
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
public class FCitas {
     public void agregarCitas(Conexion conn, ECitas cit) {
        try {
            PreparedStatement cst = null;
            String s = "call P_iCitas(?,?,?,?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setString(1, cit.getCiFecha());
            cst.setString(2, cit.getCiHora());
            cst.setInt(3, cit.getPacCodigo());
            cst.setString(4, cit.getCiDescripcion());
            cst.setInt(5, cit.getCirCodigo());
            cst.setInt(6, cit.getMedCodigo());
            cst.setString(7, cit.getCiFechaPro());
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarCitas(Conexion conn, ECitas cit) {
        try {
            PreparedStatement cst = null;
            String s = "call uCitas(?,?,?,?,?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, cit.getCiCodigo());
            cst.setString(2, cit.getCiFecha());
            cst.setString(3, cit.getCiHora());
            cst.setInt(4, cit.getPacCodigo());
            cst.setString(5, cit.getCiDescripcion());
            cst.setInt(6, cit.getCirCodigo());
            cst.setInt(7, cit.getMedCodigo());
            cst.setString(8, cit.getCiFechaPro());
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarCitas(Conexion conn, int  cit) {
        try {
            PreparedStatement cst = null;
            String s = "call eCitas(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, cit);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

  public void enlistarCitas(Conexion conn,JTable tabla) {

      DefaultTableModel model = new DefaultTableModel();
        String [] columnas = {"Codigo","Fecha","Hora","Codigo Paciente","Descripcion","Cirugia cod","Medico Cod","Fecha Pro"};
        model =  new DefaultTableModel(null,columnas);
        String sql = "select * from tblcitas";
            String[] filas  = new String[100];
            Statement st ;
            ResultSet rs ;
            
             
        try {
            st = conn.getConnectar().createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            for(int i = 0; i<=8;i++){
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
