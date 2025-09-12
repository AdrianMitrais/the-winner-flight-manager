package org.thewinner.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "aircraftId")
    private String aircraftId;
    @Column(name = "capacity")
    private String capacity;

    private String aircraftConfirmation() {
        return "New Aircraft Registered: " + this.aircraftId;
    }
}
