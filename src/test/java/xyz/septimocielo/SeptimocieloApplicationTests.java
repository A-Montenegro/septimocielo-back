package xyz.septimocielo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.septimocielo.model.Videojuego;
import xyz.septimocielo.services.VideojuegoService;

import static org.junit.Assert.assertTrue;

@SpringBootTest
class SeptimocieloApplicationTests {
	@Autowired
	VideojuegoService videojuegoService;

	@Test
	void contextLoads() {
		Videojuego videojuego = this.videojuegoService.getOne(1L);
		assertTrue(videojuego.getNombre().equals("Baten Kaitos"));
	}

}
