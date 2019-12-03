package projectflota.program.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import projectflota.program.dto.OccurenceDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Builder
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Occurence")

public class Occurence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long occurrenceId;
    @Column( name = "startTravellingDate" )
    private LocalDate startTravellingDate;
    @Column( name = "endTravellingDate" )
    private LocalDate endTravellingDate;
    @Column( name = "carUser" )
    private Long carUser;
    @Column( name = "car" )
    private Long car;
    @Column( name = "startCarOdoMeter" )
    private Integer startCarOdoMeter;
    @Column( name = "stopCarOdoMeter" )
    private Integer stopCarOdometer;
    @Column( name = "costFV" )
    private Long costFV;
    @Column( name = "revenueFV" )
    private Long revenueFV;
    @Column( name = "comment" )
    private String comment;
    @Column( name = "damaged" )
    private Boolean damaged;
    @Column( name = "damageComment" )
    private String damageComment;

    public Occurence(Long occurrenceId, LocalDate startTravellingDate, LocalDate endTravellingDate, Long carUser, Long car, Integer startCarOdoMeter, Integer stopCarOdometer, Long costFV, Long revenueFV, String comment, Boolean damaged, String damageComment) {
        this.occurrenceId = occurrenceId;
        this.startTravellingDate = startTravellingDate;
        this.endTravellingDate = endTravellingDate;
        this.carUser = carUser;
        this.car = car;
        this.startCarOdoMeter = startCarOdoMeter;
        this.stopCarOdometer = stopCarOdometer;
        this.costFV = costFV;
        this.revenueFV = revenueFV;
        this.comment = comment;
        this.damaged = damaged;
        this.damageComment = damageComment;
    }

    public OccurenceDTO toDto(){
        return OccurenceDTO.builder()
                .occurrenceId(occurrenceId)
                .startTravellingDate(startTravellingDate)
                .endTravellingDate(endTravellingDate)
                .carUser(carUser)
                .car(car)
                .startCarOdoMeter(startCarOdoMeter)
                .stopCarOdometer(stopCarOdometer)
                .costFV(costFV)
                .revenueFV(revenueFV)
                .comment(comment)
                .damaged(damaged)
                .damageComment(damageComment)
                .build();
    }
}
