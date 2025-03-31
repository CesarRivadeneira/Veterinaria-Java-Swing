/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void guardar(Duenio duenio, Mascota masco){
    
        dueniojpa.create(duenio);
        mascotajpa.create(masco);
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
}
