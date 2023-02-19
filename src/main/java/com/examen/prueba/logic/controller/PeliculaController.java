package com.examen.prueba.logic.controller;

import com.examen.prueba.logic.model.Pelicula;
import com.examen.prueba.logic.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String findByIdPelicula(@PathVariable Integer id, Model model) {
        Pelicula findOnebyId = service.findByIdPelicula(id);

        //System.out.println(findOnebyId.getNombre());
        model.addAttribute("findOnebyId", findOnebyId);
        return "/modulePeliculas/FindAll"; //TODO implementation html and route html for find one movie
    }

    @RequestMapping("/nuevo")
    public String nuevaPelicula(Model model) {
        Pelicula pelicula = new Pelicula();
        model.addAttribute("pelicula", pelicula);
        return "modulePeliculas/create";

    }

    @RequestMapping(value = "/guardar" , method = RequestMethod.POST)
    public String crearPelicula(@ModelAttribute("pelicula") Pelicula pelicula) {
        service.crear(pelicula);
        return "redirect:/pelicula/findAll";

    }

    @RequestMapping(value = "/actualizar/{id}")
    public ModelAndView editarPelicula(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("modulePeliculas/editPelicula");
        Pelicula pelicula = service.findByIdPelicula(id);
        mav.addObject("pelicula", pelicula);
        return mav;
    }


    @RequestMapping(value ="/eliminar/{id}")
    public String eliminarPelicula(@PathVariable(name = "id") int id) {
        service.deleteById(id);
        return "redirect:/pelicula/findAll";

    }

}
