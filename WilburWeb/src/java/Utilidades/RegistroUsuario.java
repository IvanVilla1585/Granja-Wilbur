/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.Date;

/**
 *
 * @author Juan
 */
public class RegistroUsuario {
    private int numDoc;
    private int tDoc;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private Date fechaNac;
    private int departamento;
    private int ciudad;
    private int tipoSangre;
    private int tipoRh;
    private int estado;
    private String direccion;
    private int telefono;
    private int telMovil;
    private String email;
    private int profesion;
    private Date fechaObtTitulo;
    private int cargo;
    private Date fechaContrato;
    private int tipoContrato;
    
    public RegistroUsuario(int numDoc, int tDoc, String nombres, String apellido1, String apellido2, Date fechaNac, 
                           int departamento, int ciudad, int tipoSangre, int tipoRh, int estado, String direccion, 
                           int telefono, int telMovil, String email, int profesion, Date fechaObtTitulo, int cargo, 
                           Date fechaContrato, int tipoContrato) {
        this.numDoc = numDoc;
        this.tDoc = tDoc;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNac = fechaNac;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.tipoSangre = tipoSangre;
        this.tipoRh = tipoRh;
        this.estado = estado;
        this.direccion = direccion;
        this.telefono = telefono;
        this.telMovil = telMovil;
        this.email = email;
        this.profesion = profesion;
        this.fechaObtTitulo = fechaObtTitulo;
        this.cargo = cargo;
        this.fechaContrato = fechaContrato;
        this.tipoContrato = tipoContrato;
    }
    
    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
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

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public int getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(int tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public int getTipoRh() {
        return tipoRh;
    }

    public void setTipoRh(int tipoRh) {
        this.tipoRh = tipoRh;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelMovil() {
        return telMovil;
    }

    public void setTelMovil(int telMovil) {
        this.telMovil = telMovil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getProfesion() {
        return profesion;
    }

    public void setProfesion(int profesion) {
        this.profesion = profesion;
    }

    public Date getFechaObtTitulo() {
        return fechaObtTitulo;
    }

    public void setFechaObtTitulo(Date fechaObtTitulo) {
        this.fechaObtTitulo = fechaObtTitulo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public int getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(int tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
