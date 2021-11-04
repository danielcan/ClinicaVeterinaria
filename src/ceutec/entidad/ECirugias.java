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
public class ECirugias {

    private int CirCodigo;
    private String CirDuracion;
    private String CirDescripcion;
    private String CirRiesgo;
    private String CirNombre;
    private char CirAnestesia;

    public ECirugias() {
    }

    public ECirugias(int CirCodigo, String CirDuracion, String CirDescripcion, String CirRiesgo, String CirNombre, char CirAnestesia) {
        this.CirCodigo = CirCodigo;
        this.CirDuracion = CirDuracion;
        this.CirDescripcion = CirDescripcion;
        this.CirRiesgo = CirRiesgo;
        this.CirNombre = CirNombre;
        this.CirAnestesia = CirAnestesia;
    }

    public int getCirCodigo() {
        return CirCodigo;
    }

    public void setCirCodigo(int CirCodigo) {
        this.CirCodigo = CirCodigo;
    }

    public String getCirDuracion() {
        return CirDuracion;
    }

    public void setCirDuracion(String CirDuracion) {
        this.CirDuracion = CirDuracion;
    }

    public String getCirDescripcion() {
        return CirDescripcion;
    }

    public void setCirDescripcion(String CirDescripcion) {
        this.CirDescripcion = CirDescripcion;
    }

    public String getCirRiesgo() {
        return CirRiesgo;
    }

    public void setCirRiesgo(String CirRiesgo) {
        this.CirRiesgo = CirRiesgo;
    }

    public String getCirNombre() {
        return CirNombre;
    }

    public void setCirNombre(String CirNombre) {
        this.CirNombre = CirNombre;
    }

    public char getCirAnestesia() {
        return CirAnestesia;
    }

    public void setCirAnestesia(char CirAnestesia) {
        this.CirAnestesia = CirAnestesia;
    }

}
