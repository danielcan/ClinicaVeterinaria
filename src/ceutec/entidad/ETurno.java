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
public class ETurno {
    private int TurCodigo; 
    private String TurNombre; 
    private String TurHoraIni; 
    private String TurHoraFin;

    public ETurno() {
    }

    public ETurno(int TurCodigo, String TurNombre, String TurHoraIni, String TurHoraFin) {
        this.TurCodigo = TurCodigo;
        this.TurNombre = TurNombre;
        this.TurHoraIni = TurHoraIni;
        this.TurHoraFin = TurHoraFin;
    }

    public int getTurCodigo() {
        return TurCodigo;
    }

    public void setTurCodigo(int TurCodigo) {
        this.TurCodigo = TurCodigo;
    }

    public String getTurNombre() {
        return TurNombre;
    }

    public void setTurNombre(String TurNombre) {
        this.TurNombre = TurNombre;
    }

    public String getTurHoraIni() {
        return TurHoraIni;
    }

    public void setTurHoraIni(String TurHoraIni) {
        this.TurHoraIni = TurHoraIni;
    }

    public String getTurHoraFin() {
        return TurHoraFin;
    }

    public void setTurHoraFin(String TurHoraFin) {
        this.TurHoraFin = TurHoraFin;
    }
    
    
    
}
