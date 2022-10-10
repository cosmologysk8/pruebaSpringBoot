package com.appprueba.prueba.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

    @GetMapping("/")
    public String index(Model model){
        return "variables/index";
    }

//    @GetMapping("/string/{texto}")
//    public String variable(@PathVariable String texto, Model model){
//        model.addAttribute("resultado", "El texto enviado a la ruta es: " + texto );
//
//        return "variables/ver";
//    }

    @GetMapping("/string/{texto}/{numero}")
    public String variable(@PathVariable String texto,@PathVariable Integer numero, Model model){
        model.addAttribute("resultado", "El texto enviado a la ruta es: " + texto +
                "y el numero enviado es : " + numero);

        return "variables/ver";
    }
}
