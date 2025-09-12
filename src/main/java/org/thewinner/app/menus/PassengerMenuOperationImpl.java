package org.thewinner.app.menus;

import org.thewinner.app.FlightManagerApp;

import java.util.Scanner;

public class PassengerMenuOperationImpl extends MenuOperation{

    public PassengerMenuOperationImpl(FlightManagerApp flightManagerApp) {
        super(flightManagerApp);
    }

    @Override
    public void navigateMenu(int option) {
        switch (option) {
            case 1 -> flightBooking();
            case 2 -> cancelBooking();
            case 3 -> flightManagerApp.logout();
        }
    }

    private void flightBooking() {
        System.out.println("Enter Name: ");
    }

    private void cancelBooking() {
        System.out.println("Enter Booking Number: ");
    }

    @Override
    public void showMenu(Scanner scanner) {
        System.out.println("""
                1. Book a Flight
                2. Cancel Booking
                3. Logout
                Enter Option:
                """);
        int option = scanner.nextInt();
        navigateMenu(option);
    }
}
