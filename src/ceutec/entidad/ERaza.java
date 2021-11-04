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
public class ERaza {

    private int RazCodigo;
    private String RazNombre;
    private int EsCodigo;
    private String RazLogevidad;

    public ERaza() {
    }

    public ERaza(int RazCodigo, String RazNombre, int EsCodigo, String RazLogevidad) {
        this.RazCodigo = RazCodigo;
        this.RazNombre = RazNombre;
        this.EsCodigo = EsCodigo;
        this.RazLogevidad = RazLogevidad;
    }

    public int getRazCodigo() {
        return RazCodigo;
    }

    public void setRazCodigo(int RazCodigo) {
        this.RazCodigo = RazCodigo;
    }

    public String getRazNombre() {
        return RazNombre;
    }

    public void setRazNombre(String RazNombre) {
        this.RazNombre = RazNombre;
    }

    public int getEsCodigo() {
        return EsCodigo;
    }

    public void setEsCodigo(int EsCodigo) {
        this.EsCodigo = EsCodigo;
    }

    public String getRazLogevidad() {
        return RazLogevidad;
    }

    public void setRazLogevidad(String RazLogevidad) {
        this.RazLogevidad = RazLogevidad;
    }

}
