package org.thewinner.app.menus;

import org.thewinner.app.FlightManagerApp;

import java.util.Scanner;

public class PassengerMenuOperationImpl extends MenuOperation{

    public PassengerMenuOperationImpl(FlightManagerApp flightManagerApp) {
        super(flightManagerApp);
    }

    @Override
    public void navigateMenu(int option) {

    }

    @Override
    public void showMenu(Scanner scanner) {
        System.out.println("""
                1. Book a Flight \n
                2. Cancel Booking \n
                Enter Option:
                """);
    }
}
