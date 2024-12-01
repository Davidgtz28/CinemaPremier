/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinePremier.dulceria.CRUD_Dulceria.controller;

import com.cinePremier.dulceria.CRUD_Dulceria.model.Persona;
import com.cinePremier.dulceria.CRUD_Dulceria.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jezuz
 */
@Controller
@RequestMapping("/personas")
public class PersonaController {

@Autowired
private PersonaService personaService;

@GetMapping
public String listarPersonas(Model model) {
model.addAttribute("personas", personaService.listarTodas() );
return "persona-list";

}

@GetMapping("/nuevo")
public String mostrarFormularioNuevaPersona(Model model) {
model.addAttribute("persona", new Persona());
return "persona-form";

}

@PostMapping
public String guardarPersona(Persona persona) {
personaService.guardar(persona);
return "redirect:/personas";

}

@GetMapping("/editar/{id}")
public String mostrarFormularioEditarPersona(@PathVariable Long id, Model model) {
model.addAttribute("persona", personaService.obtenerPorId(id));
return "persona-form";

}

@GetMapping("/eliminar/{id}")
public String eliminarPersona(@PathVariable Long id) {
personaService.eliminar(id);
return "redirect:/personas";
}
}
