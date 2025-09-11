package org.thewinner.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thewinner.app.menus.AdminMenuOperation;
import org.thewinner.app.menus.LoginOperation;
import org.thewinner.app.menus.PassengerMenuOperation;
import org.thewinner.app.sessions.AppSession;

import java.util.Scanner;

@Component
public class FlightManagerApp {

    private LoginOperation loginOperation;
    private AdminMenuOperation adminMenuOperation;
    private PassengerMenuOperation passengerMenuOperation;
    private AppSession appSession;

    @Autowired
    public FlightManagerApp(LoginOperation loginOperation, AdminMenuOperation adminMenuOperation, PassengerMenuOperation passengerMenuOperation) {
        this.loginOperation = loginOperation;
        this.adminMenuOperation = adminMenuOperation;
        this.passengerMenuOperation = passengerMenuOperation;
    }

    private boolean appStarted = false;

    public void start() {
        this.appSession = new AppSession();
        while(appStarted) {
            loginOperation.showMenu(appSession.getScanner());
        }

    }

    public void preload() {
        this.appStarted = true;
    }

    public void loadLoginMenu() {
        loginOperation.showMenu(appSession.getScanner());
    }

    public void loadAdminMenu() {
        adminMenuOperation.showMenu(appSession.getScanner());
    }

    public void loadPassengerMenu() {
        passengerMenuOperation.showMenu(appSession.getScanner());
    }

    public void stopApp() {
    }
}
