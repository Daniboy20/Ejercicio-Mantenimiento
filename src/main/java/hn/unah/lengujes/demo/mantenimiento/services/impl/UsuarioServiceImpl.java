package hn.unah.lengujes.demo.mantenimiento.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lengujes.demo.mantenimiento.entities.Usuarios;
import hn.unah.lengujes.demo.mantenimiento.repositories.UsuarioRepository;
import hn.unah.lengujes.demo.mantenimiento.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuarios crearUsuario(Usuarios usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public String eliminarUsuario(String codigoUsuario) {

        if (this.usuarioRepository.existsById(codigoUsuario))
        {
            this.usuarioRepository.deleteById(codigoUsuario);
            return "Usuario Eliminado";
        }
        return "No existe el usuario";
    }

    @Override
    public Usuarios buscarUsuarioCodigo(String codigoUsuario) {

            return this.usuarioRepository.findById(codigoUsuario).get();
    }

    @Override
    public List<Usuarios> obtenerUsuarios() {
        return (List<Usuarios>) this.usuarioRepository.findAll();
    }
    
}
