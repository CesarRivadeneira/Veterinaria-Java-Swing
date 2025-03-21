/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.logica;

import java.util.List;
import org.example.persistence.ControladoraPersistencia;

/**
 *
 * @author Cesar
 */
public class Controladora {
    ControladoraPersistencia controlPersist = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String razaMasco, String colorMasco, String nombreDuenio, String celularDuenio, String observacionesMasco, String alergico, String atencionEspecial) {
        Duenio duenio = new Duenio();
        
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celularDuenio);
        
        Mascota masco = new Mascota();
        
        masco.setNombre(nombreMasco);
        masco.setRaza(razaMasco);
        masco.setColor(colorMasco);
        masco.setObservaciones(observacionesMasco);
        masco.setAtEspecial(atencionEspecial);
        masco.setAlergia(alergico);
        
        controlPersist.guardar(duenio,masco);
    }

    public List<Mascota> traerMascotas() {
       return controlPersist.traerMascotas();
    }

    public void borrarMascota(int idMascota) {
     controlPersist.borrarMascota(idMascota);
    }

   
    
    
}
