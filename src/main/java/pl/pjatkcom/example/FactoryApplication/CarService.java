package pl.pjatkcom.example.FactoryApplication;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car buildCar(String brand, String model) {
        Car car = new Car(brand,model,4,6);

        return carRepository.save(car);
    }


    public void addWheel(Car car) {
        if (car.getWheels() < 5 ) {
            System.out.println("You add wheels");
            System.out.println(car.getWheels() + 1);
        } else {
            System.out.println("You can't add more wheels!!!");
        }
    }

    public Car findById(Long id) {
        Optional<Car> byId = carRepository.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        } else {
            return null;
        }
    }

    //Poczytac o PathVarVariable
    //POCZYTAC O OPTIONAL
    //POCZYTAC O REQUESTPARAM
    //PRZECWICZYC ROZNE ZAPYTANIA Z CARREPOSITORY
    //POCZYTAC O JPAREPOSITORY
}
