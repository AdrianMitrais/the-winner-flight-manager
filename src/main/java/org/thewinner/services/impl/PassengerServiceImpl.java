package org.thewinner.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thewinner.repositories.BookingRepository;
import org.thewinner.repositories.RouteRepository;
import org.thewinner.services.PassengerService;

@Service
public class PassengerServiceImpl implements PassengerService {

    BookingRepository bookingRepository;
    RouteRepository routeRepository;

    @Autowired
    public PassengerServiceImpl(BookingRepository bookingRepository, RouteRepository routeRepository) {
        this.bookingRepository = bookingRepository;
        this.routeRepository = routeRepository;
    }

    @Override
    public String booking() {
        return "";
    }

    @Override
    public String cancellation() {
        return "";
    }
}
