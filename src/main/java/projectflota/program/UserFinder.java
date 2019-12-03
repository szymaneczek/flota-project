package projectflota.program;

import org.springframework.stereotype.Service;
import projectflota.program.dto.CarUserDTO;
import projectflota.program.entity.CarUser;
import projectflota.program.repository.CarUserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserFinder {
    private final CarUserRepository carUserRepository;
    public List<CarUserDTO> carUserList(){
        return carUserRepository.findAll().stream()
                .map(CarUser::toDto)
                .collect(Collectors.toList());
    }

    public UserFinder(CarUserRepository carUserRepository) {
        this.carUserRepository = carUserRepository;
    }
}


