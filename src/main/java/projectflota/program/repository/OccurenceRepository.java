package projectflota.program.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectflota.program.entity.Occurence;

public interface OccurenceRepository extends JpaRepository <Occurence, Long> {
}
