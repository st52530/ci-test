package cz.st52530.citest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@ComponentScan("cz.st52530.citest")
public class CitestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitestApplication.class, args);
	}

}
