package projectflota.program.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectflota.program.dto.CarDTO;
import projectflota.program.entity.Car;
import projectflota.program.repository.CarRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class CarService {

    private final CarRepository carRepository;


    public List<CarDTO> carList() {
        log.info("car list");
        return carRepository.findAll().stream()
                .map(car -> new CarDTO(car.getCarId()))
                .collect(Collectors.toList());
    }

    public void createOrUpdate(CarDTO dto) {
        Car car = Car.builder()
                .carId(dto.getCarId())
                .VIN(dto.getVIN())
                .registrationNumber(dto.getRegistrationNumber())
                .carTypeModel(dto.getCarTypeModel())
                .dateStartUse(dto.getDateStartUse())
                .dateEndUse(dto.getDateEndUse())
                .build();
        carRepository.save(car);
    }
}


