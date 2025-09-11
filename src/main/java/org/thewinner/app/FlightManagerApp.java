package org.thewinner.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thewinner.app.menus.LoginOperation;
import org.thewinner.app.sessions.AppSession;

@Component
public class FlightManagerApp {

    @Autowired
    LoginOperation loginOperation;

    private boolean appStarted = false;

    public void start() {
        AppSession appSession = new AppSession();
        while(appStarted) {
            loginOperation.showMenu(appSession.getScanner());
        }

    }

    public void preload() {
        this.appStarted = true;
    }
}
