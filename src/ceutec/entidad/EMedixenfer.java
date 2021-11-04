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
public class EMedixenfer {

    private int MeCodigo;
    private int EnCodigo;

    public EMedixenfer() {
    }

    public EMedixenfer(int MeCodigo, int EnCodigo) {
        this.MeCodigo = MeCodigo;
        this.EnCodigo = EnCodigo;
    }

    public int getMeCodigo() {
        return MeCodigo;
    }

    public void setMeCodigo(int MeCodigo) {
        this.MeCodigo = MeCodigo;
    }

    public int getEnCodigo() {
        return EnCodigo;
    }

    public void setEnCodigo(int EnCodigo) {
        this.EnCodigo = EnCodigo;
    }

}
