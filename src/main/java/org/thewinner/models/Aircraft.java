package org.thewinner.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

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
