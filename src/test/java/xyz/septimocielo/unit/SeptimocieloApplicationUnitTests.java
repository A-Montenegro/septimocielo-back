package xyz.septimocielo.unit;

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
class SeptimocieloApplicationUnitTests {

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
		usuario.setUsername("test");
		usuario.setPassword(encoder.encode("yuxrayg2"));
		usuario.setNombre("Test");
		usuario.setApellido1("test");
		usuario.setApellido2("test");
		usuario.setEmail("test@test.com");
		usuario = usuarioRepository.save(usuario);
		assertTrue(usuario.getUsername().equals("test"));

	}

}
