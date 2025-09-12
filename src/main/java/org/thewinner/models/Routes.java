package org.thewinner.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Routes {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "aircraftId")
    private String aircraftId;
    @Column(name = "routeId")
    private String routeId;
    @Column(name = "departure")
    private String departure;
    @Column(name = "destination")
    private String destination;
    @Column(name = "runningDay")
    private String runningDay;

}
