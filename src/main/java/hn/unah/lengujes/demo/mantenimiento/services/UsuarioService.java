package hn.unah.lengujes.demo.mantenimiento.services;

import java.util.List;

import hn.unah.lengujes.demo.mantenimiento.entities.Usuarios;

public interface UsuarioService {

    public Usuarios crearUsuario (Usuarios usuario);

    public String eliminarUsuario (String codigoUsuario);

    public Usuarios buscarUsuarioCodigo (String codigoUsuario);

    public List<Usuarios> obtenerUsuarios();

}
