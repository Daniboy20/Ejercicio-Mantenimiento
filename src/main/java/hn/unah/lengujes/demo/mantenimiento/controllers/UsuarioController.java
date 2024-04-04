package hn.unah.lengujes.demo.mantenimiento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lengujes.demo.mantenimiento.entities.Usuarios;
import hn.unah.lengujes.demo.mantenimiento.services.impl.UsuarioServiceImpl;
import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;


    @PostMapping("/crear")
    private Usuarios crearUsuario(@RequestBody Usuarios usuario)
    {
        return this.usuarioServiceImpl.crearUsuario(usuario);
    }

    @DeleteMapping("/eliminar")
    private String eliminarUsuario(@RequestParam(name = "codigousuario") String codigoUsuario)
    {
        return this.usuarioServiceImpl.eliminarUsuario(codigoUsuario);
    }

    @GetMapping("/buscar/{codigoUsuario}")
    public Usuarios buscarUsuario(@PathVariable String codigoUsuario) {
        return this.usuarioServiceImpl.buscarUsuarioCodigo(codigoUsuario);
    }

    @GetMapping("/todos")
    public List<Usuarios> todosUsuario() {
        return this.usuarioServiceImpl.obtenerUsuarios();
    }
    

}
