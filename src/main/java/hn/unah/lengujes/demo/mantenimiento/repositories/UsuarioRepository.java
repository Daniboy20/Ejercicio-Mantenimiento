package hn.unah.lengujes.demo.mantenimiento.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.unah.lengujes.demo.mantenimiento.entities.Usuarios;

public interface UsuarioRepository extends CrudRepository<Usuarios,String>{
    
}
