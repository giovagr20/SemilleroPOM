package com.aadvantageshopping.pruebas.models;

public class RegistrarCompradorModel {

    private String numeroAadvantage;
    private String email;
    private String nombre;
    private String apellido;
    private String codigoPostal;
    private String clave;

    public RegistrarCompradorModel() {
    }

    public RegistrarCompradorModel(String numeroAadvantage, String email, String nombre, String apellido, String codigoPostal, String clave) {
        this.numeroAadvantage = numeroAadvantage;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
        this.clave = clave;
    }

    public String getNumeroAadvantage() {
        return numeroAadvantage;
    }

    public void setNumeroAadvantage(String numeroAadvantage) {
        this.numeroAadvantage = numeroAadvantage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
