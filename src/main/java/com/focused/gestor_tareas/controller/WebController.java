package com.focused.gestor_tareas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "login";
    }

    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/mis-grupos")
    public String misGrupos() {
        return "mis-grupos";
    }

    @GetMapping("/estadisticas")
    public String estadisticas() {
        return "estadisticas";
    }

    @GetMapping("/calendario")
    public String calendario() {
        return "calendario";
    }

    @GetMapping("/notificaciones")
    public String notificaciones() {
        return "notificaciones";
    }



}
