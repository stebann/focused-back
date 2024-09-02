package com.focused.gestor_tareas.repository;

import com.focused.gestor_tareas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos personalizados
}

