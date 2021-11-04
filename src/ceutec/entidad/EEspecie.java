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
public class EEspecie {

    private int EsCodigo;
    private String EsNombre;
    private String EsFamilia;

    public EEspecie() {
    }

    public EEspecie(int EsCodigo, String EsNombre, String EsFamilia) {
        this.EsCodigo = EsCodigo;
        this.EsNombre = EsNombre;
        this.EsFamilia = EsFamilia;
    }

    public int getEsCodigo() {
        return EsCodigo;
    }

    public void setEsCodigo(int EsCodigo) {
        this.EsCodigo = EsCodigo;
    }

    public String getEsNombre() {
        return EsNombre;
    }

    public void setEsNombre(String EsNombre) {
        this.EsNombre = EsNombre;
    }

    public String getEsFamilia() {
        return EsFamilia;
    }

    public void setEsFamilia(String EsFamilia) {
        this.EsFamilia = EsFamilia;
    }

}
