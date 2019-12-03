package projectflota.program.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import projectflota.program.dto.CarUserDTO;

import javax.persistence.*;

@Getter
@Builder
@Setter
@NoArgsConstructor
@Entity
@Table(name = "CarUser")

public class CarUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(name = "user_first_name")
    private String name;
    @Column(name = "user_surname")
    private String surname;



    public CarUser(Long userId, String name, String surname) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
    }

    public CarUserDTO toDto(){
        return CarUserDTO.builder()
                .userId(userId)
                .name(name)
                .surname(surname)
                .build();
    }
}
