package cz.czechitas.java2webapps.lekce10.controller;

import cz.czechitas.java2webapps.lekce10.service.RodicService;
import cz.czechitas.java2webapps.lekce10.service.StudentService;
import cz.czechitas.java2webapps.lekce10.service.TridaService;
import cz.czechitas.java2webapps.lekce10.service.UcitelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for displaying class (trida)
 */
@Controller
public class TridaController {
    private final TridaService tridaService;
    private final StudentService studentService;

    @Autowired
    public TridaController(TridaService tridaService, StudentService studentService, RodicService rodicService, UcitelService ucitelService) {
        this.tridaService = tridaService;
        this.studentService = studentService;
    }

    @GetMapping("/")
    public ModelAndView seznamTrid(@PageableDefault(sort = {"nazev"}) Pageable pageable) {
        return new ModelAndView("index")
                .addObject("tridy", tridaService.seznamTrid(pageable));
    }

    @GetMapping("/trida/{nazev}")
    public ModelAndView tridaDetail(@PathVariable String nazev) {
        return new ModelAndView("trida-detail")
                .addObject("trida", tridaService.singleClass(nazev));
    }

    @GetMapping("/student/{id:[0-9]+}")
    public ModelAndView student(@PathVariable Integer id) {
        return new ModelAndView("student-detail")
                .addObject("student", studentService.student(id));
    }

}
