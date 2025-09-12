package org.thewinner.app.menus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thewinner.app.FlightManagerApp;
import org.thewinner.services.AdminService;
import org.thewinner.services.impl.AdminServiceImpl;

import java.util.Scanner;

/**
 * The type Admin menu operation.
 */
@Component
public class AdminMenuOperationImpl extends MenuOperation {

    /**
     * The Admin service.
     */
    @Autowired
    AdminService adminService;

    /**
     * Instantiates a new Admin menu operation.
     *
     * @param flightManagerApp the flight manager app
     */
    public AdminMenuOperationImpl(FlightManagerApp flightManagerApp) {
        super(flightManagerApp);
    }

    @Override
    public void showMenu(Scanner scanner) {
        System.out.println("""
                1. Register Aircraft
                2. Register Routes
                3. Register Destination
                4. Run Booking Service
                5. Run Flights
                6. Next Day
                7. Logout
                Enter Option:
                """);
        int option = scanner.nextInt();
        navigateMenu(option);
    }

    @Override
    public void navigateMenu(int option) {
        switch (option) {
            case 1 -> registerAircraft();
            case 2 -> registerRoutes();
            case 3 -> registerDestination();
            case 4 -> runBookingService();
            case 5 -> runFlights();
            case 6 -> nextDay();
            case 7 -> flightManagerApp.start();
        }
    }


    /**
     * Register Aircraft
     */
    private void registerAircraft() {
        Scanner scanner = flightManagerApp.getSession().getScanner();
        System.out.println("Enter Aircraft: ");
        String aircraftId = scanner.next();
        System.out.println("Enter Capacity");
        int capacity = scanner.nextInt();
        String save = adminService.registerAircraft(aircraftId, capacity);
        System.out.println(save);

        showMenu(flightManagerApp.getSession().getScanner());
    }

    /**
     * Register Routes
     */
    private void registerRoutes() {
        Scanner scanner = flightManagerApp.getSession().getScanner();
        System.out.println("Enter Departure: ");
        String departure = scanner.next();
        System.out.println("Enter Destination");
        String destination = scanner.next();
        System.out.println("Enter Day");
        String day = scanner.next();
        String save = adminService.registerRoutes(departure, destination, day);
        System.out.println(save);
        showMenu(flightManagerApp.getSession().getScanner());
    }

    /**
     * Register Destination
     */
    private void registerDestination() {
        Scanner scanner = flightManagerApp.getSession().getScanner();
        System.out.println("Enter Destination: ");
        String destination = scanner.next();
        showMenu(flightManagerApp.getSession().getScanner());
    }

    private void runBookingService() {
        System.out.println("run");
        showMenu(flightManagerApp.getSession().getScanner());
    }

    private void runFlights() {
        System.out.println("run");
        showMenu(flightManagerApp.getSession().getScanner());
    }

    private void nextDay() {
        flightManagerApp.getSession().setCurrentDay("TUESDAY");
        showMenu(flightManagerApp.getSession().getScanner());
    }


    /**
     * Log out of admin
     */
    private void logout() {
        flightManagerApp.logout();
    }



}
