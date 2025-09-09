package org.thewinner.services.starters.impl;

import org.springframework.stereotype.Service;
import org.thewinner.services.starters.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

    private String currentUser = "no-user";

    @Override
    public void login(String user) {
        if (user.equalsIgnoreCase("admin")) {
            currentUser = "admin";
        }

        if (user.equalsIgnoreCase("passenger")) {
            currentUser = "passenger";
        }
    }

    @Override
    public String checkCurrentUser() {
        return currentUser;
    }

    @Override
    public void logout() {
        currentUser = "no-user";
    }
}
