package com.examen.prueba.logic.controller;

import com.examen.prueba.logic.model.Cine;
import com.examen.prueba.logic.model.Pelicula;
import com.examen.prueba.logic.service.CineService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cine")
public class CineController {

    private final CineService service;


    public CineController(CineService service) {
        this.service = service;
    }

    @RequestMapping("/findAll")
    public String  findAll(Model model) {
        List<Cine> listCine = this.service.findAll();

        model.addAttribute("listCine", listCine);

        return "/moduleCine/FindAll";
    }

}
