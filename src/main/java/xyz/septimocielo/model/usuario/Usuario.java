package xyz.septimocielo.model.usuario;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
@Getter
@Setter
@NoArgsConstructor
public class Usuario {

    @Id
    private Long id;
    private String username;
    private String password;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
}
