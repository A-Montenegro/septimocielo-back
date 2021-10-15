package xyz.septimocielo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import xyz.septimocielo.model.usuario.Usuario;
import xyz.septimocielo.model.usuario.UsuarioRepository;
import xyz.septimocielo.services.videojuego.VideojuegoServiceImpl;

import javax.transaction.Transactional;

import static org.junit.Assert.assertTrue;

@SpringBootTest
@Transactional
class SeptimocieloApplicationTests {

	@Autowired
	VideojuegoServiceImpl videojuegoServiceImpl;

	@Autowired
    UsuarioRepository usuarioRepository;

	@Autowired
	BCryptPasswordEncoder encoder;

	@Test
	void testFirstItemName() {
		assertTrue(this.videojuegoServiceImpl.getOne(1L).getNombre().equals("Baten Kaitos"));
	}

	@Test
	public void createUserTest(){
		Usuario usuario = new Usuario();
		usuario.setId(-1L);
		usuario.setUsername("bertocrk");
		usuario.setPassword(encoder.encode("yuxrayg2"));
		usuario.setNombre("Alberto Martínez Montenegro");
		usuario.setApellido1("Martínez");
		usuario.setApellido2("Montenegro");
		usuario.setEmail("alberto.crk@gmail.com");
		usuario = usuarioRepository.save(usuario);
		assertTrue(usuario.getUsername().equals("bertocrk"));

	}

}
