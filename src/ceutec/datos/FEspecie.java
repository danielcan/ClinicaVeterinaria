/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;
import ceutec.controlador.Conexion;
import ceutec.entidad.EEspecie;
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
public class FEspecie {
     public void agregarEspecie(Conexion conn, EEspecie eespe) {
        try {
            PreparedStatement cst = null;
            String s = "call P_iTBLEspecie(?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setString(1, eespe.getEsNombre());
            cst.setString(2, eespe.getEsFamilia());
        
          
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        //return mensaje;
    }

    public void modificarEspecie(Conexion conn, EEspecie eespe) {
        try {
            PreparedStatement cst = null;
            String s = "call uEspecie(?,?,?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, eespe.getEsCodigo());
            cst.setString(2, eespe.getEsNombre());
            cst.setString(3, eespe.getEsFamilia());
            
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void eliminarEspecie(Conexion conn, int escodigo) {
        try {
            PreparedStatement cst = null;
            String s = "call eEspecie(?)";
            cst = conn.getConnectar().prepareStatement(s);
            cst.setInt(1, escodigo);
            cst.execute();
            cst.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

   public void enlistarEspecie(Conexion conn, JTable tabla) {

        DefaultTableModel model = new DefaultTableModel();
        String[] columnas = {"Es_codigo", "Es_nombre", "Es_Familia"};
        model = new DefaultTableModel(null, columnas);
        String sql = "select * from tblespecie";
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
