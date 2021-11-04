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
public class ECitas {

    private int CiCodigo;
    private String CiFecha;
    private String CiHora;
    private int PacCodigo;
    private String CiDescripcion;
    private int CirCodigo;
    private int MedCodigo;
    private String CiFechaPro;

    public ECitas() {
    }

    public ECitas(int CiCodigo, String CiFecha, String CiHora, int PacCodigo, String CiDescripcion, int CirCodigo, int MedCodigo, String CiFechaPro) {
        this.CiCodigo = CiCodigo;
        this.CiFecha = CiFecha;
        this.CiHora = CiHora;
        this.PacCodigo = PacCodigo;
        this.CiDescripcion = CiDescripcion;
        this.CirCodigo = CirCodigo;
        this.MedCodigo = MedCodigo;
        this.CiFechaPro = CiFechaPro;
    }

    public int getCiCodigo() {
        return CiCodigo;
    }

    public void setCiCodigo(int CiCodigo) {
        this.CiCodigo = CiCodigo;
    }

    public String getCiFecha() {
        return CiFecha;
    }

    public void setCiFecha(String CiFecha) {
        this.CiFecha = CiFecha;
    }

    public String getCiHora() {
        return CiHora;
    }

    public void setCiHora(String CiHora) {
        this.CiHora = CiHora;
    }

    public int getPacCodigo() {
        return PacCodigo;
    }

    public void setPacCodigo(int PacCodigo) {
        this.PacCodigo = PacCodigo;
    }

    public String getCiDescripcion() {
        return CiDescripcion;
    }

    public void setCiDescripcion(String CiDescripcion) {
        this.CiDescripcion = CiDescripcion;
    }

    public int getCirCodigo() {
        return CirCodigo;
    }

    public void setCirCodigo(int CirCodigo) {
        this.CirCodigo = CirCodigo;
    }

    public int getMedCodigo() {
        return MedCodigo;
    }

    public void setMedCodigo(int MedCodigo) {
        this.MedCodigo = MedCodigo;
    }

    public String getCiFechaPro() {
        return CiFechaPro;
    }

    public void setCiFechaPro(String CiFechaPro) {
        this.CiFechaPro = CiFechaPro;
    }

}
