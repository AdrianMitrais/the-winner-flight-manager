package org.thewinner.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thewinner.models.Aircraft;
import org.thewinner.models.Destination;
import org.thewinner.models.Routes;
import org.thewinner.repositories.AircraftRepository;
import org.thewinner.repositories.DestinationRepository;
import org.thewinner.repositories.RouteRepository;
import org.thewinner.services.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    AircraftRepository aircraftRepository;
    DestinationRepository destinationRepository;
    RouteRepository routeRepository;

    @Autowired
    public AdminServiceImpl(AircraftRepository aircraftRepository, DestinationRepository destinationRepository, RouteRepository routeRepository) {
        this.aircraftRepository = aircraftRepository;
        this.destinationRepository = destinationRepository;
        this.routeRepository = routeRepository;
    }

    @Override
    public String registerAircraft(String aircraftId, int capacity) {
        Aircraft aircraft = new Aircraft();
        aircraft.setAircraftId(aircraftId);
        aircraft.setCapacity(capacity);
        aircraftRepository.save(aircraft);
        return "Aircraft Registered: " + aircraftId;
    }

    @Override
    public String registerRoutes(String departure, String destination, String day) {
        Routes routes = new Routes();
        routes.setRouteId(departure.toLowerCase() + destination.toLowerCase() + day.toLowerCase());
        routes.setDeparture(departure);
        routes.setDestination(destination);
        routes.setRunningDay(day);

        routeRepository.save(routes);

        return "";
    }

    @Override
    public String registerDestination(String destination) {
        Destination destinationBlob = new Destination();
        destinationBlob.setDestinationId(destination.toUpperCase());
        destinationBlob.setName(destination);

        destinationRepository.save(destinationBlob);
        return destination;
    }

    @Override
    public String runBookingService() {
        return "yeet";
    }

    @Override
    public String runFlights() {
        return "yeet";
    }

    @Override
    public String nextDay() {
        return "yeet";
    }
}
