package xyz.septimocielo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import xyz.septimocielo.dao.UsuarioDAO;
import xyz.septimocielo.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    public Usuario getOne(Long id){
        return usuarioDAO.findById(id).get();
    }

    public List<Usuario> findAll(){

        return usuarioDAO.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Usuario usuario = usuarioDAO.findByUsername(username);

       List<GrantedAuthority> roles = new ArrayList<>();
       roles.add(new SimpleGrantedAuthority("ADMIN"));

       UserDetails userDetails = new User(usuario.getUsername(), usuario.getPassword(), roles);

       return userDetails;

    }
}
