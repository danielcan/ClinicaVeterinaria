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
public class ETurnoxmedico {
    private int TMCodigo;
    private int TurCodigo; 
    private int MedCodigo; 
    private String TMMesTurno; 
    private String TMDiaTurno; 

    public ETurnoxmedico() {
    }

    public ETurnoxmedico(int TMCodigo, int TurCodigo, int MedCodigo, String TMMesTurno, String TMDiaTurno) {
        this.TMCodigo = TMCodigo;
        this.TurCodigo = TurCodigo;
        this.MedCodigo = MedCodigo;
        this.TMMesTurno = TMMesTurno;
        this.TMDiaTurno = TMDiaTurno;
    }

    public int getTMCodigo() {
        return TMCodigo;
    }

    public void setTMCodigo(int TMCodigo) {
        this.TMCodigo = TMCodigo;
    }

    public int getTurCodigo() {
        return TurCodigo;
    }

    public void setTurCodigo(int TurCodigo) {
        this.TurCodigo = TurCodigo;
    }

    public int getMedCodigo() {
        return MedCodigo;
    }

    public void setMedCodigo(int MedCodigo) {
        this.MedCodigo = MedCodigo;
    }

    public String getTMMesTurno() {
        return TMMesTurno;
    }

    public void setTMMesTurno(String TMMesTurno) {
        this.TMMesTurno = TMMesTurno;
    }

    public String getTMDiaTurno() {
        return TMDiaTurno;
    }

    public void setTMDiaTurno(String TMDiaTurno) {
        this.TMDiaTurno = TMDiaTurno;
    }
    
    
}
