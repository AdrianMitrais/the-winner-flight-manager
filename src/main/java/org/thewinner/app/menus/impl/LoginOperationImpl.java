package org.thewinner.app.menus.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thewinner.app.FlightManagerApp;
import org.thewinner.app.menus.AdminMenuOperation;
import org.thewinner.app.menus.LoginOperation;
import org.thewinner.app.menus.PassengerMenuOperation;
import org.thewinner.app.sessions.AdminSession;

import java.util.Scanner;

@Component
public class LoginOperationImpl implements LoginOperation {

    @Autowired
    FlightManagerApp flightManagerApp;

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
                Login As: \n
                1. Admin \n
                2. Passenger \n
                Enter Option: \n
                """);
        int option = scanner.nextInt();
        navigateMenu(option);
    }
}
