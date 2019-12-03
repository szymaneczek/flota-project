package projectflota.program;

import org.springframework.stereotype.Service;
import projectflota.program.dto.OccurenceDTO;
import projectflota.program.entity.Occurence;
import projectflota.program.repository.OccurenceRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OccurenceFinder {
    private final OccurenceRepository occurenceRepository;

    public List<OccurenceDTO> occurenceList(){
        return occurenceRepository.findAll().stream()
                .map(Occurence::toDto)
                .collect(Collectors.toList());
    }

    public OccurenceFinder(OccurenceRepository occurenceRepository) {
        this.occurenceRepository = occurenceRepository;
    }
}


