package org.thewinner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.thewinner.models.Booking;

import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {
}
