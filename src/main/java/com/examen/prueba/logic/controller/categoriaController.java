package com.examen.prueba.logic.controller;

import com.examen.prueba.logic.model.Categoria;
import com.examen.prueba.logic.model.Pelicula;
import com.examen.prueba.logic.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String crearPelicula(@ModelAttribute("categoria") Categoria categoria) {
        this.service.insert(categoria);
        return "redirect:/categoria/findAll";
    }

    @RequestMapping(value = "/actualizar/{id}")
    public ModelAndView editCategoria(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView("moduleCategoria/edit");
        Categoria categoria = this.service.findOne(id);
        mav.addObject("categoria", categoria);
        return mav;
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        this.service.deleteById(id);
        return "redirect:moduleCategoria/FindAll";
    }

}
