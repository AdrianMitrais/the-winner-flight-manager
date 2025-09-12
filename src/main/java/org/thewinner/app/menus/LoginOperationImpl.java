package org.thewinner.app.menus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thewinner.app.FlightManagerApp;

import java.util.Scanner;

@Component
public class LoginOperationImpl extends MenuOperation {

    public LoginOperationImpl(FlightManagerApp flightManagerApp) {
        super(flightManagerApp);
    }

    @Override
    public void navigateMenu(int option) {
        switch (option) {
            case 1 -> flightManagerApp.loadAdminMenu();
            case 2 -> flightManagerApp.loadPassengerMenu();
            case 3 -> flightManagerApp.stopApp();
        }
    }

    @Override
    public void showMenu(Scanner scanner) {
        System.out.println("""
                Login As:
                1. Admin
                2. Passenger
                3. Exit
                Enter Option:
                """);
        int option = scanner.nextInt();
        navigateMenu(option);
    }
}
