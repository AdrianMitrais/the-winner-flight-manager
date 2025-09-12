package org.thewinner.app.sessions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PassengerSession {
    private String name;
    private boolean isActive;
}
