package pl.pjatkcom.example.FactoryApplication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {

}
