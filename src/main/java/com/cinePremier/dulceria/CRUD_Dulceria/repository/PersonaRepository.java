/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cinePremier.dulceria.CRUD_Dulceria.repository;

import com.cinePremier.dulceria.CRUD_Dulceria.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jezuz
 */
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
