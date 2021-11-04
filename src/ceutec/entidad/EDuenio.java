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
public class EDuenio {
    private int duecodigo;
    private String duenombre;
    private String dueIdentidad;
    private String dueDireccion;
    private int dueTelefono;

    public EDuenio(){}
    
    public EDuenio(int eduecodigo, String duenombre, String dueIdentidad, String dueDireccion, int dueTelefono) {
        this.duecodigo = eduecodigo;
        this.duenombre = duenombre;
        this.dueIdentidad = dueIdentidad;
        this.dueDireccion = dueDireccion;
        this.dueTelefono = dueTelefono;
    }

    

    public int getDuecodigo() {
        return duecodigo;
    }

    public void setDuecodigo(int eduecodigo) {
        this.duecodigo = eduecodigo;
    }

    public String getDuenombre() {
        return duenombre;
    }

    public void setDuenombre(String duenombre) {
        this.duenombre = duenombre;
    }

    public String getDueIdentidad() {
        return dueIdentidad;
    }

    public void setDueIdentidad(String dueIdentidad) {
        this.dueIdentidad = dueIdentidad;
    }

    public String getDueDireccion() {
        return dueDireccion;
    }

    public void setDueDireccion(String dueDireccion) {
        this.dueDireccion = dueDireccion;
    }

    public int getDueTelefono() {
        return dueTelefono;
    }

    public void setDueTelefono(int dueTelefono) {
        this.dueTelefono = dueTelefono;
    }
    
    
    
    
}
