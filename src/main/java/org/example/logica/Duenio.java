/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



/**
 *
 * @author Cesar
 */
@Entity
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDuenio;
    
    private String Nombre;
    
    private String Celular;

     @OneToMany(mappedBy = "duenio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mascota> mascotas = new ArrayList<>();

    
    
    public Duenio() {
    }

    public Duenio(int idDuenio, String Nombre, String Celular, List<Mascota> mascota) {
        this.idDuenio = idDuenio;
        this.Nombre = Nombre;
        this.Celular = Celular;
        
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
   
public List<Mascota> getMascotas() {
    return mascotas;
}

public void setMascotas(List<Mascota> mascotas) {
    this.mascotas = mascotas;
}
  
    
    
    
}
