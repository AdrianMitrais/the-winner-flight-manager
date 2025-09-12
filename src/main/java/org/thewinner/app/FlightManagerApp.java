package org.thewinner.app;

import org.springframework.stereotype.Component;
import org.thewinner.app.menus.AdminMenuOperationImpl;
import org.thewinner.app.menus.LoginOperationImpl;
import org.thewinner.app.menus.MenuOperation;
import org.thewinner.app.menus.PassengerMenuOperationImpl;
import org.thewinner.app.sessions.AppSession;

import java.util.Scanner;


@Component
public class FlightManagerApp {

    MenuOperation menuOperation;
    AppSession appSession;

    public FlightManagerApp() {
        appSession = new AppSession();
        this.menuOperation = new LoginOperationImpl(this);

    }

    public void start() {
        while(appSession.isAppStarted()) {
            menuOperation.showMenu(appSession.getScanner());
        }
    }

    public void loadAdminMenu() {
        this.menuOperation = new AdminMenuOperationImpl(this);
        menuOperation.showMenu(appSession.getScanner());
    }

    public void loadPassengerMenu() {
        this.menuOperation = new PassengerMenuOperationImpl(this);
        menuOperation.showMenu(appSession.getScanner());
    }

    public void logout() {
        this.menuOperation = new LoginOperationImpl(this);
        menuOperation.showMenu(appSession.getScanner());
    }

    public void stopApp() {
        appSession.setAppStarted(false);
        appSession.getScanner().close();
    }

    public AppSession getSession() {
        return appSession;
    }
}
