package projectflota.program.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import projectflota.program.dto.OccurenceDTO;
import projectflota.program.entity.Occurence;
import projectflota.program.repository.OccurenceRepository;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class OccurenceService {
    private final OccurenceRepository occurenceRepository;

    public void createOccurence(OccurenceDTO dto){
        log.info("create -> dto: {}", dto);
        Occurence createdOccurence = occurenceRepository.save(new Occurence(dto.getOccurrenceId(),
                dto.getStartTravellingDate(),
                dto.getEndTravellingDate(),
                dto.getCarUser(),
                dto.getCar(),
                dto.getStartCarOdoMeter(),
                dto.getStopCarOdometer(), dto.getCostFV(),
                dto.getRevenueFV(), dto.getComment(),
                dto.getDamaged(),
                dto.getDamageComment()));
        log.info("New occurence created with id {}", createdOccurence.getOccurrenceId());
    }
}


