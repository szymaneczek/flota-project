package projectflota.program.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectflota.program.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
