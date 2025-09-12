package org.thewinner.app.menus;

import org.thewinner.app.FlightManagerApp;

import java.util.Scanner;

public abstract class MenuOperation {
    FlightManagerApp flightManagerApp;

    public abstract void navigateMenu(int option);

    public abstract void showMenu(Scanner scanner);

    MenuOperation(FlightManagerApp flightManagerApp) {
        this.flightManagerApp = flightManagerApp;
    }
}
