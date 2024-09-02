package com.focused.gestor_tareas.repository;

import com.focused.gestor_tareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findByUsuarioId(Long usuarioId);
    List<Tarea> findByProyectoId(Long proyectoId);
}

