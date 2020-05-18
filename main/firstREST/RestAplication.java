package firstREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({ "lab7.controller", "LAB7.firstREST","lab.model" })
@SpringBootApplication
public class RestAplication {

	public static void main(String[] args) {
		SpringApplication.run(RestAplication.class, args);
	}

}