package org.thewinner.app.menus;

import org.thewinner.app.sessions.PassengerSession;

import java.util.Scanner;

public interface PassengerMenuOperation {
    void navigateMenu(Scanner scanner, PassengerSession passengerSession);
}
