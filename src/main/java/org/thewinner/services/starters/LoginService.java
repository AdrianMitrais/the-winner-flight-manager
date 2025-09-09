package org.thewinner.services.starters;

public interface LoginService {
    void login(String user);
    String checkCurrentUser();
    void logout();
}
