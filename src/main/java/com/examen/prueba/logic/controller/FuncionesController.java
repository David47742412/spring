package com.examen.prueba.logic.controller;

import com.examen.prueba.logic.model.Funciones;
import com.examen.prueba.logic.model.genericViewClass.GenericClass;
import com.examen.prueba.logic.service.FuncionesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RequestMapping("/funciones")
@Controller
public class FuncionesController  {

    private final FuncionesService service;


    public FuncionesController(FuncionesService service) {
        this.service = service;
    }

    @RequestMapping("/findAll")
    public String findAll(Model model) {

        List<Funciones> listFunciones = this.service.findAll();

        model.addAttribute("listFunciones", listFunciones);

        return "moduleFunciones/FindAll";
    }

}
