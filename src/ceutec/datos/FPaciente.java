/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;

import ceutec.controlador.Conexion;
import ceutec.entidad.EPaciente;
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
public class FPaciente {
      public void agregarPaciente(Conexion conn, EPaciente pac) {
        try {
            PreparedStatement cst;
            String s = "call P_IPaciente(?,?,?,?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setString(1, pac.getPacNombre());
            cst.setInt(2, pac.getEsCodigo());
            cst.setInt(3, pac.getRazCodigo());
            cst.setInt(4, pac.getDueCodigo());
            cst.setInt(5, pac.getMedCodigo());
            cst.setString(7, pac.getPacFecha());
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarPaciente(Conexion conn, EPaciente pac) {
        try {
            PreparedStatement cst = null;
            String s = "call uPaciente(?,?,?,?,?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, pac.getPacCodigo());
            cst.setString(2, pac.getPacNombre());
            cst.setInt(3, pac.getEsCodigo());
            cst.setInt(4, pac.getRazCodigo());
            cst.setInt(5, pac.getDueCodigo());
            cst.setInt(6, pac.getMedCodigo());
            cst.setString(8, pac.getPacFecha());
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarPaciente(Conexion conn, int  pac) {
        try {
            PreparedStatement cst = null;
            String s = "call epaciente(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, pac);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

     public void enlistarPaciente(Conexion conn, JTable tabla) {

        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = {"Codigo", "Nombre","Especie","RazCodigo","Duenio","Medico","foto","Fecha"};
        model = new DefaultTableModel(null, columnas);
        String sql = "select * from tblpaciente";
        String[] filas = new String[8];
        Statement st;
        ResultSet rs;

        try {
            st = conn.getConnectar().createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i <= 8; i++) {
                    filas[i] = rs.getString(i + 1);
                    System.out.println(filas[i]);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            //  System.out.println("Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se puede listar en la tabla");
        }
    }
}
