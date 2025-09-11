package org.thewinner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thewinner.models.Routes;

import java.util.UUID;

public interface RouteRepository extends JpaRepository<Routes, UUID> {
}
