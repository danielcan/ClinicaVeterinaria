/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;

import ceutec.controlador.Conexion;
import ceutec.entidad.Eenfermedad;
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
public class FEnfermedad {

    public void agregarEnfermedad(Conexion conn, Eenfermedad enfer) {
        try {
            PreparedStatement cst = null;
            String s = "call P_iEnfermedad(?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, enfer.getRazCodigo());
            cst.setString(2, enfer.getEnNombre());

            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarEnfermedad(Conexion conn, Eenfermedad enfer) {
        try {
            PreparedStatement cst = null;
            String s = "call uEnfermedad(?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, enfer.getEnCodigo());
            cst.setInt(2, enfer.getRazCodigo());
            cst.setString(3, enfer.getEnNombre());

            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarEnfermedad(Conexion conn, int enfecodigo) {
        try {
            PreparedStatement cst = null;
            String s = "call eEnfermedad(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, enfecodigo);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void enlistarEnfermedad(Conexion conn, JTable tabla) {

        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = {"En_codigo", "Raz_Codigo", "Nombre"};
        model = new DefaultTableModel(null, columnas);
        String sql = "select * from tblenfermedad";
        String[] filas = new String[4];
        Statement st;
        ResultSet rs;

        try {
            st = conn.getConnectar().createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i <= 3; i++) {
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
