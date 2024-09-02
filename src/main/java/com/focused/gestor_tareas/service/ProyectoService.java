package com.focused.gestor_tareas.service;

import com.focused.gestor_tareas.model.Proyecto;
import com.focused.gestor_tareas.model.Usuario;
import com.focused.gestor_tareas.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    @Autowired
    private ProyectoRepository proyectoRepository;

    public List<Proyecto> listarProyectos() {
        return proyectoRepository.findAll();
    }

    public Proyecto obtenerProyectoPorId(Long id) {
        return new Proyecto();
    }

    public Proyecto guardarProyecto(Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }

    public void eliminarProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }
}

