package org.thewinner.app.menus;

import org.thewinner.app.sessions.AdminSession;

import java.util.Scanner;

public interface AdminMenuOperation {
    void navigateMenu(int option);
    void showMenu(AdminSession adminSession, Scanner scanner);
}

