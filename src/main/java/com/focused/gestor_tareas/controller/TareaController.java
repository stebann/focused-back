package com.focused.gestor_tareas.controller;

import com.focused.gestor_tareas.model.Tarea;
import com.focused.gestor_tareas.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping
    public List<Tarea> listarTareas() {
        return tareaService.listarTareas();
    }

    @GetMapping("/{id}")
    public Tarea obtenerTareaPorId(@PathVariable Long id) {
        return tareaService.obtenerTareaPorId(id);
    }

    @PostMapping
    public Tarea guardarTarea(@RequestBody Tarea tarea) {
        return tareaService.guardarTarea(tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareaService.eliminarTarea(id);
    }
}

