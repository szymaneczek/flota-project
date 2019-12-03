package projectflota.program.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {
    private Long carId;
    private String VIN;
    private String registrationNumber;
    private String carTypeModel;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateStartUse;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateEndUse;

    public CarDTO(Long carId) {
        this.carId = carId;
    }


}
