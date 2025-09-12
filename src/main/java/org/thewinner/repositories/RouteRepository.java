package org.thewinner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.thewinner.models.Routes;

import java.util.UUID;

@Repository
public interface RouteRepository extends JpaRepository<Routes, UUID> {
}
