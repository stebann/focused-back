package com.focused.gestor_tareas.repository;

import com.focused.gestor_tareas.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    // Métodos personalizados
}
