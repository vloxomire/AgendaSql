package com.max.agendasql.Models;

import java.io.Serializable;

public class Agenda implements Serializable{
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private Integer dni;
    private String email;
    private String calle;
    private Integer altura;
    private Integer pisoDto;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public Integer getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public Integer getPisoDto() {
        return pisoDto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public void setPisoDto(Integer pisoDto) {
        this.pisoDto = pisoDto;
    }

    public Agenda(Integer id, String nombre, String apellido, Integer telefono, Integer dni, String email,String calle, Integer altura, Integer pisoDto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.email=email;
        this.calle = calle;
        this.altura = altura;
        this.pisoDto = pisoDto;
    }
}
