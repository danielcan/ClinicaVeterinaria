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
public class Eenfermedad {

    private int EnCodigo;
    private int RazCodigo;
    private String EnNombre;

    public Eenfermedad() {
    }

    public Eenfermedad(int EnCodigo, int RazCodigo, String EnNombre) {
        this.EnCodigo = EnCodigo;
        this.RazCodigo = RazCodigo;
        this.EnNombre = EnNombre;
    }

    public int getEnCodigo() {
        return EnCodigo;
    }

    public void setEnCodigo(int EnCodigo) {
        this.EnCodigo = EnCodigo;
    }

    public int getRazCodigo() {
        return RazCodigo;
    }

    public void setRazCodigo(int RazCodigo) {
        this.RazCodigo = RazCodigo;
    }

    public String getEnNombre() {
        return EnNombre;
    }

    public void setEnNombre(String EnNombre) {
        this.EnNombre = EnNombre;
    }

}
