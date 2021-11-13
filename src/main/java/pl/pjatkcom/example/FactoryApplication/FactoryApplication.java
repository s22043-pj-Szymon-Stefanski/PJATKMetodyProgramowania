package pl.pjatkcom.example.FactoryApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);
		Car car = new Car("Ford","Mustang",4,6);

		car.setBrand("Ford");
	}

}
