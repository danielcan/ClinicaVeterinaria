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
public class EMedico {
        private int medcodigo;
        private String mednombre;
        private String meddireccion;
        private String medtelefono;
        private String medatiende;
        private String medfechai;

    public EMedico() {
    }

    public EMedico(int medcodigo, String mednombre, String meddireccion, String medtelefono, String medatiende, String medfechai) {
        this.medcodigo = medcodigo;
        this.mednombre = mednombre;
        this.meddireccion = meddireccion;
        this.medtelefono = medtelefono;
        this.medatiende = medatiende;
        this.medfechai = medfechai;
    }

    public int getMedcodigo() {
        return medcodigo;
    }

    public void setMedcodigo(int medcodigo) {
        this.medcodigo = medcodigo;
    }

    public String getMednombre() {
        return mednombre;
    }

    public void setMednombre(String mednombre) {
        this.mednombre = mednombre;
    }

    public String getMeddireccion() {
        return meddireccion;
    }

    public void setMeddireccion(String meddireccion) {
        this.meddireccion = meddireccion;
    }

    public String getMedtelefono() {
        return medtelefono;
    }

    public void setMedtelefono(String medtelefono) {
        this.medtelefono = medtelefono;
    }

    public String getMedatiende() {
        return medatiende;
    }

    public void setMedatiende(String medatiende) {
        this.medatiende = medatiende;
    }

    public String getMedfechai() {
        return medfechai;
    }

    public void setMedfechai(String medfechai) {
        this.medfechai = medfechai;
    }
    
    
        
    
}
