package org.thewinner.app.menus;

import org.thewinner.app.FlightManagerApp;

import java.util.Scanner;

/**
 * Menu operation. Abstract for Basic Menu Operations
 */
public abstract class MenuOperation {
    /**
     * The Flight manager app. Stores the current state of the app
     */
    FlightManagerApp flightManagerApp;

    /**
     * Navigate menu. Menu navigation logic
     *
     * @param option the option
     */
    public abstract void navigateMenu(int option);

    /**
     * Show menu and accept user input
     *
     * @param scanner the scanner
     */
    public abstract void showMenu(Scanner scanner);

    /**
     * Instantiates a new Menu operation.
     *
     * @param flightManagerApp the flight manager app
     */
    MenuOperation(FlightManagerApp flightManagerApp) {
        this.flightManagerApp = flightManagerApp;
    }
}
