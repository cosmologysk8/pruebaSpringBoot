package com.appprueba.prueba.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index(){
        return "params/index";
    }

    // @RequestParam(name = "texto", required = false) se indica el parametro y con required sirve por si el usuario no ha
    // introducido un valor sale aunque sea algo
    @GetMapping("/string")
    public String param(@RequestParam(name = "texto", required = false) String texto, Model model){
        model.addAttribute("resultado", "El resultado enviado es: " + texto);

        // Para dejar la vista dentro de un directorio se hace así
        return "params/ver";
    }

    @GetMapping("/mix-params")
    public String param(@RequestParam String saludo,@RequestParam Integer numero, Model model){
        model.addAttribute("resultado", "El saludo enviado es: '" + saludo +
                "' y el número de saludos es: '" + numero + "'");

        return "params/ver";
    }

    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request, Model model){
        String saludo = request.getParameter("saludo");
        Integer numero = null;
        try {
            numero = Integer.parseInt(request.getParameter("numero"));
        }   catch (NumberFormatException e){
            numero = 0;
        }

        model.addAttribute("resultado", "El saludo enviado es: '" + saludo +
                "' y el número de saludos es: '" + numero + "'");

        return "params/ver";
    }

}
