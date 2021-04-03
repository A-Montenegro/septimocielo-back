package xyz.septimocielo.model.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);
}
