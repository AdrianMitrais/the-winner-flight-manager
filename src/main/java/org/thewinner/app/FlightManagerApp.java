package org.thewinner.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thewinner.app.menus.LoginOperation;

@Component
public class FlightManagerApp {

    @Autowired
    LoginOperation loginOperation;

    private void start() {
        loginOperation.showMenu();
    }
}
