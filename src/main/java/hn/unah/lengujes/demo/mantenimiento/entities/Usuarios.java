package hn.unah.lengujes.demo.mantenimiento.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuarios {
    
    @Id
    @Column(name = "codigousuario")
    private String codigoUsuario;

    private String nombre;

    private String apellido;

    private String departamento;

    private String correo;

    private String telefono;

    @JoinColumn(name = "idperfil" , referencedColumnName = "idperfil")
    @OneToOne(cascade = CascadeType.ALL)
    private Perfiles idPerfil; 


}
