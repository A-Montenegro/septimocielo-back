package xyz.septimocielo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.septimocielo.model.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);
}
