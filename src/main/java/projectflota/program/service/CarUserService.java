package projectflota.program.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectflota.program.dto.CarUserDTO;
import projectflota.program.entity.CarUser;
import projectflota.program.repository.CarUserRepository;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class CarUserService {

    private final CarUserRepository carUserRepository;

    public void createUser(CarUserDTO dto){
        log.info("create -> dto: {}", dto);
        CarUser createdUser = carUserRepository.save(new CarUser(dto.getUserId(),
                dto.getName(),
                dto.getSurname()));
        log.info("New car user created with id {}", createdUser.getUserId());
    }


}


