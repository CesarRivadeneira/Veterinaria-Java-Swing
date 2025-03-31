/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



/**
 *
 * @author Cesar
 */
@Entity
public class Mascota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idMascota;
    private String Nombre;
    private String Raza;
    private String alergia;
    private String atEspecial;
    private String Observaciones;
    private String Color;
    
    @OneToOne(mappedBy = "mascota", cascade = CascadeType.ALL)
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(int idMascota, String Nombre, String Raza, String alergia, String atEspecial, String Observaciones, String Color, Duenio duenio) {
        this.idMascota = idMascota;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.alergia = alergia;
        this.atEspecial = atEspecial;
        this.Observaciones = Observaciones;
        this.Color = Color;
        this.duenio = duenio;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String isAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String isAtEspecial() {
        return atEspecial;
    }

    public void setAtEspecial(String atEspecial) {
        this.atEspecial = atEspecial;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
    
   
    
    
}
