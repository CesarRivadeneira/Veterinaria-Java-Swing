/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.logica;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Cesar
 */
@Entity
public class Consulta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idConsulta;
      
    private LocalDate FechaConsulta;
     
    private String motivoConsulta;
    
    private String diagnosticoConsulta;
    
    private String tratamientoConsulta;
    
    private String observacionesConsulta;  
      
    private Double costoConsulta;
    
    @ManyToOne
    @JoinColumn(name = "mascota_idMascota") // Esta clave foránea está en la tabla Mascota
    private Mascota mascota;

    public Consulta() {
    }

    public Consulta(int idConsulta, LocalDate FechaConsulta, String motivoConsulta, String diagnosticoConsulta, String tratamientoConsulta, String observacionesConsulta, Double costoConsulta, Mascota mascota) {
        this.idConsulta = idConsulta;
        this.FechaConsulta = FechaConsulta;
        this.motivoConsulta = motivoConsulta;
        this.diagnosticoConsulta = diagnosticoConsulta;
        this.tratamientoConsulta = tratamientoConsulta;
        this.observacionesConsulta = observacionesConsulta;
        this.costoConsulta = costoConsulta;
        this.mascota = mascota;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public LocalDate getFechaConsulta() {
        return FechaConsulta;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public String getDiagnosticoConsulta() {
        return diagnosticoConsulta;
    }

    public String getTratamientoConsulta() {
        return tratamientoConsulta;
    }

    public String getObservacionesConsulta() {
        return observacionesConsulta;
    }

    public Double getCostoConsulta() {
        return costoConsulta;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public void setFechaConsulta(LocalDate FechaConsulta) {
        this.FechaConsulta = FechaConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public void setDiagnosticoConsulta(String diagnosticoConsulta) {
        this.diagnosticoConsulta = diagnosticoConsulta;
    }

    public void setTratamientoConsulta(String tratamientoConsulta) {
        this.tratamientoConsulta = tratamientoConsulta;
    }

    public void setObservacionesConsulta(String observacionesConsulta) {
        this.observacionesConsulta = observacionesConsulta;
    }

    public void setCostoConsulta(Double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Consulta{" + "idConsulta=" + idConsulta + ", FechaConsulta=" + FechaConsulta + ", motivoConsulta=" + motivoConsulta + ", diagnosticoConsulta=" + diagnosticoConsulta + ", tratamientoConsulta=" + tratamientoConsulta + ", observacionesConsulta=" + observacionesConsulta + ", costoConsulta=" + costoConsulta + ", mascota=" + mascota + '}';
    }
    
    
}
