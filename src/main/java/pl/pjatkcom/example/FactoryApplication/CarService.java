package pl.pjatkcom.example.FactoryApplication;

import org.springframework.stereotype.Service;

@Service
public class CarService {

    public Car buildCar(String brand, String model) {
        Car car = new Car(brand,model,4,6);

        return car;
    }

    public void addWheel(Car car) {
        if (car.getWheels() < 5 ) {
            System.out.println("You add wheels");
            System.out.println(car.getWheels() + 1);
        } else {
            System.out.println("You can't add more wheels!!!");
        }
    }
}
