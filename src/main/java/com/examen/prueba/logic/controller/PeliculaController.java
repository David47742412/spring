package com.examen.prueba.logic.controller;

import com.examen.prueba.logic.model.Pelicula;
import com.examen.prueba.logic.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pelicula")
public class PeliculaController {

    private final PeliculaService service;

    public PeliculaController(PeliculaService service) {
        this.service = service;
    }

    @RequestMapping("/findAll")
    public String listarPeliculas(Model model) {

        List<Pelicula> listaPeliculas = service.findAll();

        model.addAttribute("listaPeliculas", listaPeliculas);
        return "modulePeliculas/FindAll";
    }

    @RequestMapping("findOne/{id}")
    public String findByIdPelicula(@PathVariable String id, Model model) {
        Pelicula findOnebyId = service.findByIdPelicula(Integer.parseInt(id));

        System.out.println(findOnebyId.getNombre());
        model.addAttribute("findOnebyId", findOnebyId);
        return "/modulePeliculas/FindAll"; //TODO implementation html and route html for find one movie
    }

}
