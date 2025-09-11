package org.thewinner.models;

import lombok.Data;

@Data
public class Routes {
    private Long id;
    private String aircraftId;
    private String routeId;
    private String departure;
    private String destination;
    private String runningDay;
}
