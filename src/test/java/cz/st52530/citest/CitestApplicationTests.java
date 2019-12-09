package cz.st52530.citest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CitestApplicationTests {

	@Test
	void contextLoads() {
            Assertions.assertEquals(1, 1);
	}

}
