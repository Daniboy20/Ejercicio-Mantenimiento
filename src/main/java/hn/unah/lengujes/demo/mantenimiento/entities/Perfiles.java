package hn.unah.lengujes.demo.mantenimiento.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "perfiles")
@Data
public class Perfiles {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idperfil")
    private long idPerfil;
    private String rol;

    private String descripcion;

    
}
