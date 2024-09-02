package com.focused.gestor_tareas.controller;

import com.focused.gestor_tareas.model.Proyecto;
import com.focused.gestor_tareas.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {

    @Autowired
    private ProyectoService proyectoService;

    @GetMapping
    public List<Proyecto> listarProyectos() {
        return proyectoService.listarProyectos();
    }

    @GetMapping("/{id}")
    public Proyecto obtenerProyectoPorId(@PathVariable Long id) {
        return proyectoService.obtenerProyectoPorId(id);
    }

    @PostMapping
    public Proyecto guardarProyecto(@RequestBody Proyecto proyecto) {
        return proyectoService.guardarProyecto(proyecto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProyecto(@PathVariable Long id) {
        proyectoService.eliminarProyecto(id);
    }
}

