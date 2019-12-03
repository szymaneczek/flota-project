package projectflota.program.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import projectflota.program.dto.CarDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long carId;
    @Column(name = "VIN")
    private String VIN;
    @Column(name = "registrationNumber")
    private String registrationNumber;
    @Column(name = "carTypeModel")
    private String carTypeModel;
    @Column(name="dateStartUse")
    private LocalDate dateStartUse;
    @Column (name="dateEndUse")
    private LocalDate dateEndUse;

    public CarDTO toDto(){
        return CarDTO.builder()
                .carId(carId)
                .VIN(VIN)
                .registrationNumber(registrationNumber)
                .carTypeModel(carTypeModel)
                .dateStartUse(dateStartUse)
                .dateEndUse(dateEndUse)
                .build();
    }
}


