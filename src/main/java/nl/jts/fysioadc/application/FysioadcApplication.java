package nl.jts.fysioadc.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FysioadcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FysioadcApplication.class, args);
		// lees praktijken (inc. adres)
		// parse info en stop in het domein
		// toon praktijken op een kaart
	}

}
