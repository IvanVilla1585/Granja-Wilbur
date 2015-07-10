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
    //private String tipoDoc;
    private String nombres;
    private String Apell1;
    private String Apell2;
    private String nombresApell;
    private int perf;
    //private String perfil;
    private String nombreUser;    
    private String pass;

    public AsignarPerfil(int codPerfil, int numDoc, int tDoc, String nombres, String Apell1, String Apell2, int perf, String nombreUser, String pass) {
        this.codPerfil = codPerfil;
        this.numDoc = numDoc;
        this.tDoc = tDoc;
        this.nombres = nombres;
        this.Apell1 = Apell1;
        this.Apell2 = Apell2;
        this.perf = perf;
        this.nombreUser = nombreUser;
        this.pass = pass;
    }
    
    public AsignarPerfil(int numDoc, int tDoc, String nombresApell, int perf, String pass) {
        this.codPerfil = codPerfil;
        this.numDoc = numDoc;
        this.tDoc = tDoc;
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
    /*
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }*/

    public String getNombresApell() {
        return nombresApell;
    }

    public void setNombresApell(String nombresApell) {
        this.nombresApell = nombresApell;
    }
    /*
    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }*/

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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApell1() {
        return Apell1;
    }

    public void setApell1(String Apell1) {
        this.Apell1 = Apell1;
    }

    public String getApell2() {
        return Apell2;
    }

    public void setApell2(String Apell2) {
        this.Apell2 = Apell2;
    }

    public int getPerf() {
        return perf;
    }

    public void setPerf(int perf) {
        this.perf = perf;
    }
    
}
