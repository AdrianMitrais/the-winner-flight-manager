package org.thewinner.services;

public interface AdminService {
    String registerAircraft(String aircraftId, int capacity);
    String registerRoutes(String departure, String destination, String day);
    String registerDestination(String destination);
    String runBookingService();
    String runFlights();
    String nextDay();
}
