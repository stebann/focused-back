package com.focused.gestor_tareas.controller;

import com.focused.gestor_tareas.model.Equipo;
import com.focused.gestor_tareas.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @GetMapping
    public List<Equipo> listarEquipos() {
        return equipoService.listarEquipos();
    }

    @GetMapping("/{id}")
    public Equipo obtenerEquipoPorId(@PathVariable Long id) {
        return equipoService.obtenerEquipoPorId(id);
    }

    @PostMapping
    public Equipo guardarEquipo(@RequestBody Equipo equipo) {
        return equipoService.guardarEquipo(equipo);
    }

    @DeleteMapping("/{id}")
    public void eliminarEquipo(@PathVariable Long id) {
        equipoService.eliminarEquipo(id);
    }
}

