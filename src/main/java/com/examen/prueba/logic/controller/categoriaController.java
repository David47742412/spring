package com.examen.prueba.logic.controller;

import com.examen.prueba.logic.model.Categoria;
import com.examen.prueba.logic.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categoria")
public class categoriaController {

    private final CategoriaService service;

    public categoriaController(CategoriaService service) {
        this.service = service;
    }

    @RequestMapping("/create")
    public String create(Model model) {
        Categoria categoria = new Categoria();
        model.addAttribute("categoria", categoria);
        return "moduleCategoria/create";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Categoria> listCategoria = this.service.findAll();
        model.addAttribute("listCategoria", listCategoria);
        return "moduleCategoria/FindAll";
    }

}
