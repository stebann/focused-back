package com.focused.gestor_tareas.service;

import com.focused.gestor_tareas.model.Equipo;
import com.focused.gestor_tareas.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public List<Equipo> listarEquipos() {
        return equipoRepository.findAll();
    }

    public Equipo obtenerEquipoPorId(Long id) {
        return new Equipo();
    }

    public Equipo guardarEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public void eliminarEquipo(Long id) {
        equipoRepository.deleteById(id);
    }
}

