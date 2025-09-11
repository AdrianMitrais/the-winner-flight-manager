package org.thewinner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thewinner.models.Aircraft;

import java.util.UUID;

public interface AircraftRepository extends JpaRepository<Aircraft, UUID> {
}
