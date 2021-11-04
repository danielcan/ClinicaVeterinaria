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
public class EMedicinas {

    private int MeCodigo;
    private String MeNombre;
    private String MeDosis;
    private String MePeriodoT;

    public EMedicinas() {
    }

    public EMedicinas(int MeCodigo, String MeNombre, String MeDosis, String MePeriodoT) {
        this.MeCodigo = MeCodigo;
        this.MeNombre = MeNombre;
        this.MeDosis = MeDosis;
        this.MePeriodoT = MePeriodoT;
    }

    public int getMeCodigo() {
        return MeCodigo;
    }

    public void setMeCodigo(int MeCodigo) {
        this.MeCodigo = MeCodigo;
    }

    public String getMeNombre() {
        return MeNombre;
    }

    public void setMeNombre(String MeNombre) {
        this.MeNombre = MeNombre;
    }

    public String getMeDosis() {
        return MeDosis;
    }

    public void setMeDosis(String MeDosis) {
        this.MeDosis = MeDosis;
    }

    public String getMePeriodoT() {
        return MePeriodoT;
    }

    public void setMePeriodoT(String MePeriodoT) {
        this.MePeriodoT = MePeriodoT;
    }

}
