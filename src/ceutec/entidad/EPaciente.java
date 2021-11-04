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
public class EPaciente {

    private int PacCodigo;
    private String PacNombre;
    private int EsCodigo;
    private int RazCodigo;
    private int DueCodigo;
    private int MedCodigo;
    private String PacFoto;
    private String PacFecha;

    public EPaciente() {
    }

    public EPaciente(int PacCodigo, String PacNombre, int EsCodigo, int RazCodigo, int DueCodigo, int MedCodigo, String PacFoto, String PacFecha) {
        this.PacCodigo = PacCodigo;
        this.PacNombre = PacNombre;
        this.EsCodigo = EsCodigo;
        this.RazCodigo = RazCodigo;
        this.DueCodigo = DueCodigo;
        this.MedCodigo = MedCodigo;
        this.PacFoto = PacFoto;
        this.PacFecha = PacFecha;
    }

    public int getPacCodigo() {
        return PacCodigo;
    }

    public void setPacCodigo(int PacCodigo) {
        this.PacCodigo = PacCodigo;
    }

    public String getPacNombre() {
        return PacNombre;
    }

    public void setPacNombre(String PacNombre) {
        this.PacNombre = PacNombre;
    }

    public int getEsCodigo() {
        return EsCodigo;
    }

    public void setEsCodigo(int EsCodigo) {
        this.EsCodigo = EsCodigo;
    }

    public int getRazCodigo() {
        return RazCodigo;
    }

    public void setRazCodigo(int RazCodigo) {
        this.RazCodigo = RazCodigo;
    }

    public int getDueCodigo() {
        return DueCodigo;
    }

    public void setDueCodigo(int DueCodigo) {
        this.DueCodigo = DueCodigo;
    }

    public int getMedCodigo() {
        return MedCodigo;
    }

    public void setMedCodigo(int MedCodigo) {
        this.MedCodigo = MedCodigo;
    }

    public String getPacFoto() {
        return PacFoto;
    }

    public void setPacFoto(String PacFoto) {
        this.PacFoto = PacFoto;
    }

    public String getPacFecha() {
        return PacFecha;
    }

    public void setPacFecha(String PacFecha) {
        this.PacFecha = PacFecha;
    }

}
