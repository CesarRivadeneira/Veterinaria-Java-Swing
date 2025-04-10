/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.logica;

import java.util.ArrayList;
import java.util.List;
import org.example.persistence.ControladoraPersistencia;

/**
 *
 * @author Cesar
 */
public class Controladora {
    ControladoraPersistencia controlPersist = new ControladoraPersistencia();

public void guardar(String nombreMasco, String razaMasco, String colorMasco, 
                    String nombreDuenio, String celularDuenio, 
                    String observacionesMasco, String alergico, String atencionEspecial) {

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

    // 🔹 IMPORTANTE: Verificar que se está asignando correctamente el dueño
    masco.setDuenio(duenio);
    System.out.println("Dueño asignado a mascota: " + masco.getDuenio().getNombre());

    duenio.getMascotas().add(masco);

    controlPersist.guardar(duenio);
}





    public List<Mascota> traerMascotas() {
       return controlPersist.traerMascotas();
    }

    public void borrarMascota(int idMascota) {
     controlPersist.borrarMascota(idMascota);
    }

  

    public Mascota traerMascota(int idMascota) {
        return controlPersist.traerMascota(idMascota) ;
    }

    

    public void modificarMascota(Mascota masco, String nombreMasco, String razaMasco, String colorMasco, 
            String observacionesMasco, String alergico, String atencionEspecial, String nombreDuenio, String celularDuenio) {
       masco.setNombre(nombreMasco);
       masco.setRaza(razaMasco);
       masco.setColor(colorMasco);
       masco.setObservaciones(observacionesMasco);
       masco.setAlergia(alergico);
       masco.setAtEspecial(atencionEspecial);
       
        controlPersist.modificarMascota(masco);
        
        Duenio dueno = this.buscarDuenio(masco.getDuenio().getIdDuenio());
        
        dueno.setNombre(nombreDuenio);
        dueno.setCelular(celularDuenio);
        
        this.modificarDuenio(dueno);
        
    }
    private void modificarDuenio(Duenio dueno){  
     controlPersist.modificarDuenio(dueno);
    }
    
    public void modificarDuenio2(Duenio dueni, String nombreDuenio, String celularDuenio ) {
      
        
        dueni.setNombre(nombreDuenio);
        dueni.setCelular(celularDuenio);
        
        controlPersist.modificarDuenio2(dueni);
       
        
    }

    private Duenio buscarDuenio(int idDuenio){
        return controlPersist.traerDuenio(idDuenio);  
   }

    public List<Duenio> traerDuenios() {
        return controlPersist.traerDuenios();
    }

    public void borrarDuenio(int idDuenio) {
      controlPersist.borrarMascota(idDuenio);
    }
    
    public Duenio traerDuenio(int idDuenio) {
        return controlPersist.traerDuenio(idDuenio) ;
    }

    
    
}
