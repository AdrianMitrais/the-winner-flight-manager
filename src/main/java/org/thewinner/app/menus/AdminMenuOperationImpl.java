package org.thewinner.app.menus;

import org.springframework.stereotype.Component;
import org.thewinner.app.FlightManagerApp;

import java.util.Scanner;

@Component
public class AdminMenuOperationImpl extends MenuOperation {


    public AdminMenuOperationImpl(FlightManagerApp flightManagerApp) {
        super(flightManagerApp);
    }

    @Override
    public void navigateMenu(int option) {

    }

    @Override
    public void showMenu(Scanner scanner) {
        System.out.println("""
                1. Register Aircraft \n
                2. Register Routes \n
                3. Register Destination \n
                4. Run Booking Service \n
                5. Run Flights \n
                6. Next Day \n
                Enter Option:
                """);
        int option = scanner.nextInt();
        navigateMenu(option);
    }
}
