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
public class EDueniocel {
    private int duecodigo; 
    private int duecelular;

    public EDueniocel() {
    }

    public EDueniocel(int duecodigo, int duecelular) {
        this.duecodigo = duecodigo;
        this.duecelular = duecelular;
    }

    public int getDuecodigo() {
        return duecodigo;
    }

    public void setDuecodigo(int duecodigo) {
        this.duecodigo = duecodigo;
    }

    public int getDuecelular() {
        return duecelular;
    }

    public void setDuecelular(int duecelular) {
        this.duecelular = duecelular;
    }
    
    
    
}
