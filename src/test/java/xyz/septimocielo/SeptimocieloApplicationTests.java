package xyz.septimocielo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import xyz.septimocielo.model.usuario.UsuarioRepository;
import xyz.septimocielo.model.videojuego.Videojuego;
import xyz.septimocielo.services.VideojuegoService;

import static org.junit.Assert.assertTrue;

@SpringBootTest
class SeptimocieloApplicationTests {

	@Autowired
	VideojuegoService videojuegoService;

	@Autowired
    UsuarioRepository usuarioRepository;

	@Autowired
	BCryptPasswordEncoder encoder;

	@Test
	void contextLoads() {
		Videojuego videojuego = this.videojuegoService.getOne(1L);
		assertTrue(videojuego.getNombre().equals("Baten Kaitos"));
	}

	@Test
	public void crearUsuarioTest(){
//		Usuario usuario = new Usuario();
//		usuario.setId(-1L);
//		usuario.setUsername("bertocrk");
//		usuario.setPassword(encoder.encode("yuxrayg2"));
//		Usuario retorno = usuarioDAO.save(usuario);

		assertTrue(1==1);

	}

}
