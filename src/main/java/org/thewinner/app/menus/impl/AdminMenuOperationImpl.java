package org.thewinner.app.menus.impl;

import org.springframework.stereotype.Component;
import org.thewinner.app.menus.AdminMenuOperation;
import org.thewinner.app.sessions.AdminSession;

import java.util.Scanner;

@Component
public class AdminMenuOperationImpl implements AdminMenuOperation {


    @Override
    public void navigateMenu(int option) {

    }

    @Override
    public void showMenu(AdminSession adminSession, Scanner scanner) {
        System.out.println("""
                1. Register Aircraft \n
                2. Register Routes \n
                3. Register Destination \n
                4. Run Booking Service \n
                5. Run Flights \n
                6. Next Day \n
                Enter Option:
                """);

    }
}
