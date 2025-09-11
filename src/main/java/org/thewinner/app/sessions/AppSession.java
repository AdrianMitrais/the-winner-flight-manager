package org.thewinner.app.sessions;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class AppSession {
    private boolean appStarted;
    private String currentDay;
    private boolean isBookingServiceOpen;
    private AdminSession adminSession;
    private PassengerSession passengerSession;
    private Scanner scanner;

    public AppSession() {
        this.appStarted = true;
        this.scanner = new Scanner(System.in);
    }

    public void stopApp() {
        this.appStarted = false;
        this.scanner.close();
    }
}
