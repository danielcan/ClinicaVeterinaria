/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.datos;

import ceutec.controlador.Conexion;
import ceutec.entidad.EMedico;
import ceutec.entidad.ETurnoxmedico;
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
public class FTurnoxmedico {
//     public void agregarTurnoxmedico(Conexion conn, ETurnoxmedico emed) {
//        try {
//            PreparedStatement cst = null;
//            String s = "call P_iMedico(?,?,?,?,?)";
//            cst = conn.getConnectar().prepareStatement(s);
//            cst.setString(1, emed.getMednombre());
//            cst.setString(2, emed.getMeddireccion());
//            cst.setString(3, emed.getMedtelefono());
//            cst.setString(4, emed.getMedatiende());
//            cst.setString(5, emed.getMedfechai());
//            
//            cst.execute();
//            cst.close();
//        } catch (SQLException ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }
//        //return mensaje;
//    }
//
//    public void modificarMedico(Conexion conn, EMedico emed) {
//        try {
//            PreparedStatement cst = null;
//            String s = "call uMedico(?,?,?,?,?,?)";
//            cst = conn.getConnectar().prepareStatement(s);
//            cst.setInt(1, emed.getMedcodigo());
//            cst.setString(2, emed.getMednombre());
//            cst.setString(3, emed.getMeddireccion());
//            cst.setString(4, emed.getMedtelefono());
//            cst.setString(5, emed.getMedatiende());
//            cst.setString(6, emed.getMedfechai());
//            cst.execute();
//            cst.close();
//        } catch (SQLException ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }
//
//    }
//
//    public void eliminarMedico(Conexion conn, int medcodigo) {
//        try {
//            PreparedStatement cst = null;
//            String s = "call eMedico(?)";
//            cst = conn.getConnectar().prepareStatement(s);
//            cst.setInt(1, medcodigo);
//            cst.execute();
//            cst.close();
//        } catch (SQLException ex) {
//            System.out.println("Error: " + ex.getMessage());
//        }
//    }
//
//  
//    
//    public void enlistarMedico(Conexion conn,JTable tabla) {
//
//      DefaultTableModel model = new DefaultTableModel();
//        String [] columnas = {"Codigo","nombre","Direccion","Telefono","Atiende Emergencia","Fecha In"};
//        model =  new DefaultTableModel(null,columnas);
//        String sql = "select * from tblmedico";
//            String[] filas  = new String[7];
//            Statement st = null;
//            ResultSet rs = null;
//            
//             
//        try {
//            st = conn.getConnectar().createStatement();
//            rs = st.executeQuery(sql);
//            while(rs.next()){
//            for(int i = 0; i<=4;i++){
//                filas[i] = rs.getString(i+1);
//                System.out.println(filas[i]);
//                }
//            model.addRow(filas);
//            }
//            tabla.setModel(model);
//        } catch (SQLException ex) {
//          //  System.out.println("Error: " + ex.getMessage());
//          JOptionPane.showMessageDialog(null,"No se puede listar en la tabla");
//        }
//    }
}
