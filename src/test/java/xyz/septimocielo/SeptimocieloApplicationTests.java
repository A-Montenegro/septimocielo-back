package xyz.septimocielo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
class SeptimocieloApplicationTests {

	@ContextConfiguration(classes = SeptimocieloApplicationTests.class)
	class ConfigClassApplicationContextTests {
		// class body...
	}

	@Test
	void contextLoads() {
	}

}
