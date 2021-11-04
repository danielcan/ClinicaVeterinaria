/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;
import ceutec.controlador.Conexion;
import ceutec.entidad.EMedicinas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
/**
 *
 * @author PC-lite
 */
public class FMedicinas {
      public void agregarMedicinas(Conexion conn, EMedicinas emedi) {
        try {
            PreparedStatement cst = null;
            String s = "call P_iTBLMedicinas(?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setString(1, emedi.getMeNombre());
            cst.setString(2, emedi.getMeDosis());
            cst.setString(3, emedi.getMePeriodoT());
          
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarMedicinas(Conexion conn, EMedicinas emedi) {
        try {
            PreparedStatement cst = null;
            String s = "call uMedicinas(?,?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, emedi.getMeCodigo());
            cst.setString(2, emedi.getMeNombre());
            cst.setString(3, emedi.getMeDosis());
            cst.setString(4, emedi.getMePeriodoT());
            
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarMedicinas(Conexion conn, int medicodigo) {
        try {
            PreparedStatement cst = null;
            String s = "call eMedicinas(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, medicodigo);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void enlistarMedicinas(Conexion conn, JTable tabla) {

        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = {"Me_codigo", "Me_nombre", "Dosis","Periodo"};
        model = new DefaultTableModel(null, columnas);
        String sql = "select * from tblmedicinas";
        String[] filas = new String[5];
        Statement st;
        ResultSet rs;

        try {
            st = conn.getConnectar().createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                for (int i = 0; i <= 4; i++) {
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
