package projectflota.program.dto;

import lombok.*;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarUserDTO {

    private Long userId;
    private String name;
    private String surname;
}
