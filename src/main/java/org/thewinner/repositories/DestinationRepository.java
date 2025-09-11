package org.thewinner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thewinner.models.Destination;

import java.util.UUID;

public interface DestinationRepository extends JpaRepository<Destination, UUID> {
}
