package pl.pjatkcom.example.FactoryApplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//By RestController user can communicate with the server
@RestController

//By RequestMapping the class intercepts web queries that are sent to the given address
@RequestMapping("/cars")
public class CarRestController {

    //Singleton - In object-oriented programming, a singleton class is a class that
    //can have only one object (an instance of the class) at a time
    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    //ResponseEntity - represent the whole HTTP response: status code, headers and body
    public ResponseEntity<Car> getCar() {
        return ResponseEntity.ok(carService.buildCar("Ford","Mustang"));
    }
}
