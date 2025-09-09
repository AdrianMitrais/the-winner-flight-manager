package org.thewinner.commands;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.thewinner.services.starters.LoginService;

@ShellComponent
public class UserSelectCommands {

    @Autowired
    LoginService loginService;

    @ShellMethod(value = "Choose a user to login as", key = "login")
    public void login(@ShellOption(defaultValue = "no-user") String user) {
        loginService.login(user);
    }

    @ShellMethod(value = "Log out of the application", key = "logout")
    public void logout() {
        loginService.logout();
    }

    @ShellMethod(value = "Log out of the application", key = "check-user")
    public String checkUser() {
        return loginService.checkCurrentUser();
    }



}
