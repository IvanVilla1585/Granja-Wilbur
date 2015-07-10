/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Juan
 */
public class AsignarPerfil {
    private int codPerfil;
    private int numDoc;
    private int tDoc;
    private String nombresApell;
    private int perf;
    private String nombreUser; 
    private String pass;

    public AsignarPerfil(int codPerfil, int numDoc, int tDoc, int perf, String nombreUser, String pass) {
        this.codPerfil = codPerfil;
        this.numDoc = numDoc;
        this.tDoc = tDoc;
        this.perf = perf;
        this.nombreUser = nombreUser;
        this.pass = pass;
    }
    
    public AsignarPerfil(int numDoc, int tDoc, String nombreUser, String nombresApell, int perf, String pass) {
        this.numDoc = numDoc;
        this.tDoc = tDoc;
        this.nombreUser = nombreUser;
        this.nombresApell = nombresApell;
        this.perf = perf;
        this.pass = pass;
    }
    
    public int getCodPerfil() {
        return codPerfil;
    }

    public void setCodPerfil(int codPerfil) {
        this.codPerfil = codPerfil;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public String getNombresApell() {
        return nombresApell;
    }

    public void setNombresApell(String nombresApell) {
        this.nombresApell = nombresApell;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public int gettDoc() {
        return tDoc;
    }

    public void settDoc(int tDoc) {
        this.tDoc = tDoc;
    }

    public int getPerf() {
        return perf;
    }

    public void setPerf(int perf) {
        this.perf = perf;
    }
    
}
