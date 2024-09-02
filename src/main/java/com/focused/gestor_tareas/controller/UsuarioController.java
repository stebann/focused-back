package com.focused.gestor_tareas.controller;

import com.focused.gestor_tareas.model.Usuario;
import com.focused.gestor_tareas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario();
        usuario1.setId(1L);
        usuario1.setNombre("Juan");
        usuario1.setRol("admin");
        usuario1.setTelefono("3135042682");
        usuario1.setCorreo("correo@gmail.com");
        usuario1.setContraseña("pedrito");
        usuarios.add(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setId(1L);
        usuario2.setNombre("Pedro");
        usuario2.setRol("miembro");
        usuario2.setTelefono("3325236233");
        usuario2.setCorreo("correo2@gmail.com");
        usuario2.setContraseña("camas");
        usuarios.add(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setId(1L);
        usuario3.setNombre("Maria");
        usuario3.setRol("miembro");
        usuario3.setTelefono("31353552682");
        usuario3.setCorreo("correo3@gmail.com");
        usuario3.setContraseña("mari");
        usuarios.add(usuario3);

        return usuarios;
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id) {
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        usuarioService.eliminarUsuario(id);
    }
}

