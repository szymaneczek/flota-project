package projectflota.program.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OccurenceDTO {
    private Long occurrenceId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startTravellingDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endTravellingDate;
    private Long carUser;
    private Long car;
    private Integer startCarOdoMeter;
    private Integer stopCarOdometer;
    private Long costFV;
    private Long revenueFV;
    private String comment;
    private Boolean damaged;
    private String damageComment;

}
