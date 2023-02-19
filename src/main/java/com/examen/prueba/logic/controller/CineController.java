package com.examen.prueba.logic.controller;

import com.examen.prueba.logic.model.Cine;
import com.examen.prueba.logic.model.Pelicula;
import com.examen.prueba.logic.service.CineService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/create")
    public String create(Model model) {
        Cine cine = new Cine();
        model.addAttribute("cine", cine);
        return "moduleCine/create";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String createPelicula(@ModelAttribute("cine") Cine cine) {
        this.service.insert(cine);
        return "redirect:/cine/findAll";
    }

    @RequestMapping(value = "/actualizar/{id}")
    public ModelAndView update(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("moduleCine/editCine");
        Cine cine = service.findOne(id);
        mav.addObject("cine", cine);
        return mav;
    }

}
