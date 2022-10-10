package com.appprueba.prueba.web.app.controller;
import com.appprueba.prueba.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/inicio")
    public String inicio(Model model){
        model.addAttribute("titulo", "Hola Mundo");
        return "index";
    }

    @RequestMapping("/usuario")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Adrian");
        usuario.setApellidos("de la Fuente");
        usuario.setEmail("a1999afg@gmail.com");
        model.addAttribute("usuario",usuario);
        model.addAttribute("titulo", "Perfil del usuari:".concat(usuario.getNombre()));
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Adrian", "de la Fuente", "a1999afg@gmail.com"));
        usuarios.add(new Usuario("Andres", "Guzman", "andresguzman@gmail.com"));
        usuarios.add(new Usuario("Pepe", "Villuelas", "pepevilluelas@gmail.com"));
        model.addAttribute("usuarios", usuarios);

        return "listar";
    }

}
