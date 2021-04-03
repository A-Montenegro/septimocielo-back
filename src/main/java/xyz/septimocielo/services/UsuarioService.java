package xyz.septimocielo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import xyz.septimocielo.model.usuario.UsuarioRepository;
import xyz.septimocielo.model.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario getOne(Long id){
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> findAll(){

        return usuarioRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Usuario usuario = usuarioRepository.findByUsername(username);

       List<GrantedAuthority> roles = new ArrayList<>();
       roles.add(new SimpleGrantedAuthority("ADMIN"));

       UserDetails userDetails = new User(usuario.getUsername(), usuario.getPassword(), roles);

       return userDetails;

    }
}
