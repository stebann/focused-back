package com.focused.gestor_tareas.service;

import com.focused.gestor_tareas.model.Tarea;
import com.focused.gestor_tareas.model.Usuario;
import com.focused.gestor_tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> listarTareas() {
        return tareaRepository.findAll();
    }

    public Tarea obtenerTareaPorId(Long id) {
        return new Tarea();
    }

    public Tarea guardarTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}

