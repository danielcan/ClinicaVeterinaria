/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.controlador;

import ceutec.datos.FDuenio;
import java.sql.Connection;
import ceutec.entidad.EDuenio;
import java.sql.SQLException;

/**
 *
 * @author PC-lite
 */
public class DuenioBO {
   private String mensaje = "";
   private FDuenio ddao = new FDuenio();
   
   public String agregarDuenio(EDuenio due){
   Connection cone;
   Conexion s = null;
   cone = s.getConnectar();
   try{
  //     mensaje = ddao.agregarDuenio(s, due);    
       cone.commit();
   }catch(SQLException e){
       mensaje = mensaje+ " "+e.getMessage();
       
   }finally{
   try{
       if (cone !=null){
           cone.rollback();
           cone.close();      
       }
   }catch(Exception e){
   }
 //     mensaje = mensaje+ " "+e.getMessage();
   }
       
   return mensaje;
   }
   
}
