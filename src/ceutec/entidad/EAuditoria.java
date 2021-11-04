/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceutec.entidad;

/**
 *
 * @author PC-lite
 */
public class EAuditoria {

    private String nombreTabla;
    private String fechaRegistro;
    private String hora;
    private String usuario;
    private String transaccion;

    public EAuditoria() {
    }

    public EAuditoria(String nombreTabla, String fechaRegistro, String hora, String usuario, String transaccion) {
        this.nombreTabla = nombreTabla;
        this.fechaRegistro = fechaRegistro;
        this.hora = hora;
        this.usuario = usuario;
        this.transaccion = transaccion;
    }

    public String getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

}
