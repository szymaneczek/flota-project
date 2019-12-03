package projectflota.program.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import projectflota.program.entity.UserRole;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserDTO {
    private Long id;
    private String login;
    private String password;
    private Set<UserRole> roles;
}
