package com.juanjomc.cursos.controller;

import com.juanjomc.cursos.model.Juego;
import com.juanjomc.cursos.repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JuegoController {

    @Autowired
    private JuegoRepository juegoRepository;

    // Maneja la solicitud para la ruta raíz ("/") y lista todos los juegos 
    @GetMapping("/")
    public String listarJuegos(Model model) {
        List<Juego> juegos = juegoRepository.findAll();
        model.addAttribute("juegos", juegos);
        return "index";
    }

    // Maneja la solicitud para la ruta "/juegos" y busca juegos por nombre
    @GetMapping("/juegos")
    public String buscarJuegos(@RequestParam(name = "nombre", required = false) String nombre, Model model) {
        List<Juego> juegos;
        if (nombre != null && !nombre.isEmpty()) {
            juegos = juegoRepository.findByNombreContaining(nombre);
        } else {
            juegos = juegoRepository.findAll();
        }
        model.addAttribute("juegos", juegos);
        return "index";
    }
}