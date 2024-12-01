/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinePremier.dulceria.CRUD_Dulceria.services;

import com.cinePremier.dulceria.CRUD_Dulceria.model.Persona;
import com.cinePremier.dulceria.CRUD_Dulceria.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jezuz
 */
@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;
    
    public List<Persona> listarTodas(){
        return personaRepository.findAll(); 
    }
    public Persona guardar(Persona persona){
        return personaRepository.save(persona);
    }
    public Persona obtenerPorId(Long id){
        return personaRepository.findById(id).orElse(null);
    }
    public void eliminar(Long id){
        personaRepository.deleteById(id);
    }
}
