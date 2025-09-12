package org.thewinner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thewinner.models.Destination;

import java.util.UUID;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, UUID> {
}
