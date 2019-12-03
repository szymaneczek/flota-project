package projectflota.program;

import org.springframework.stereotype.Service;
import projectflota.program.dto.CarDTO;
import projectflota.program.entity.Car;
import projectflota.program.repository.CarRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarFinder {
    private final CarRepository carRepository;

    public List<CarDTO> carList() {
        return carRepository.findAll().stream()
                .map(Car::toDto)
                .collect(Collectors.toList());
    }

    public CarFinder(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
}


