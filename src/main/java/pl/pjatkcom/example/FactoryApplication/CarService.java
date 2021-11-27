package pl.pjatkcom.example.FactoryApplication;

import org.springframework.stereotype.Service;

import java.util.Locale;
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

    public void print(Car car) {
        System.out.println(car);
    }

    public void addWheel(Car car) {
        if (car.getWheels() < 5 ) {
            System.out.println("You add wheels");
            System.out.println(car.getWheels() + 1);
        } else {
            System.out.println("You can't add more wheels!!!");
        }
    }

    public String convertBrandUP(Car car) {
        return car.getBrand().toUpperCase(Locale.ROOT);
    }

    public String convertBrandLOW(Car car) {
        return car.getBrand().toLowerCase(Locale.ROOT);
    }

    public String covertModelUP(Car car) {
        return car.getModel().toUpperCase(Locale.ROOT);
    }

    public String covertModelLOW(Car car) {
        return car.getModel().toLowerCase(Locale.ROOT);
    }

    public void changeGearOneUP(Car car) {
        if (car.getGears() < 6) {
            System.out.println(car.getGears() + 1);
            System.out.println("You change gear");
        } else {
            System.out.println("You can't change up gear");
        }
    }

    public void changeGearOneDOWN(Car car) {
        if (car.getGears() > 0) {
            System.out.println(car.getGears() - 1);
            System.out.println("You change gear");
        } else {
            System.out.println("You can't change down gear");
        }

    }

    public void removeOneWheel(Car car) {
        car.setWheels(car.getWheels() - 1);
    }

    public Car findById(Long id) {
        Optional<Car> byId = carRepository.findById(id);
        return  byId.orElse(null);
    }
}
