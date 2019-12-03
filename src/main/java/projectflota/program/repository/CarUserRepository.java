package projectflota.program.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectflota.program.entity.CarUser;

public interface CarUserRepository extends JpaRepository<CarUser, Long> {
}
