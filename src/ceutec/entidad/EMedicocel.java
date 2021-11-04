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
public class EMedicocel {
    private  int medcodigo;
    private int medcelular;

    public EMedicocel() {
    }

    public EMedicocel(int medcodigo, int medcelular) {
        this.medcodigo = medcodigo;
        this.medcelular = medcelular;
    }
    

    public int getMedcodigo() {
        return medcodigo;
    }

    public void setMedcodigo(int medcodigo) {
        this.medcodigo = medcodigo;
    }

    public int getMedcelular() {
        return medcelular;
    }

    public void setMedcelular(int medcelular) {
        this.medcelular = medcelular;
    }
    
     
}
