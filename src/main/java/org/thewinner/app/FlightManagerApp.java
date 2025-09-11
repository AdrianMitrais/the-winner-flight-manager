package org.thewinner.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thewinner.app.menus.LoginOperation;

@Component
public class FlightManagerApp {

    @Autowired
    LoginOperation loginOperation;

    private boolean appStarted = false;

    public void start() {
        preload();
        while(appStarted) {
            loginOperation.showMenu();
        }

    }

    public void preload() {
        this.appStarted = true;
    }
}
