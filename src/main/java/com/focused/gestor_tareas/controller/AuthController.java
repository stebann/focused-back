package com.focused.gestor_tareas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // Ruta para la raíz redirige a login
    @GetMapping("/")
    public String redirectToLogin() {
        return "login";
    }

    // Ruta para el registro
    @GetMapping("/registro")
    public String showRegistroPage() {
        return "registro";  // Redirige al archivo registro.html
    }

}
