/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.persistence;

import static com.mysql.cj.conf.PropertyKey.logger;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.logica.Consulta;
import org.example.logica.Duenio;
import org.example.logica.Mascota;
import org.example.persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author Cesar
 */
public class ControladoraPersistencia {
    DuenioJpaController dueniojpa = new DuenioJpaController();
    MascotaJpaController mascotajpa = new MascotaJpaController();
    ConsultaJpaController consultajpa = new ConsultaJpaController();
    
    public void guardar(Duenio duenio){
    
        dueniojpa.create(duenio);

    }

    public List<Mascota> traerMascotas() {

        return mascotajpa.findMascotaEntities();
    }
    
    public void borrarMascota(int idMascota){
    try {
    mascotajpa.destroy(idMascota);
    } catch(NonexistentEntityException ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public Mascota traerMascota(int idMascota) {
        return mascotajpa.findMascota(idMascota);
    }

    public void modificarMascota(Mascota masco) {
      try{
      mascotajpa.edit( masco);
      }catch(Exception ex){
      Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
      
   
        
      
    }

    public Duenio traerDuenio(int idDuenio) {
       return dueniojpa.findDuenio(idDuenio);
       
    }

    public void modificarDuenio(Duenio dueno) {
        try{
        dueniojpa.edit(dueno);
        }catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public List<Duenio> traerDuenios() {
       return dueniojpa.findDuenioEntities();

    }

    public void modificarDuenio2(Duenio dueni) {
        try{
        dueniojpa.edit(dueni);
        }catch(Exception ex){
        Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarConsulta(Consulta consul) {
        consultajpa.create(consul);
    }

   
}
