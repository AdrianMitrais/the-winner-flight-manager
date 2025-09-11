package org.thewinner.app.menus.impl;

import org.thewinner.app.menus.PassengerMenuOperation;

import java.util.Scanner;

public class PassengerMenuOperationImpl implements PassengerMenuOperation {

    @Override
    public void navigateMenu(Scanner scanner) {

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
