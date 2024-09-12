package com.focused.gestor_tareas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // Ruta para el login
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Redirige al archivo login.html en templates
    }

    // Ruta para el registro
    @GetMapping("/registro")
    public String showRegistroPage() {
        return "registro";  // Redirige al archivo registro.html en templates
    }

}
