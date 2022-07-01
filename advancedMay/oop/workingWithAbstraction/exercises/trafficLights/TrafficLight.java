package SoftUni.oop.workingWithAbstraction.exercises.trafficLights;

public class TrafficLight {
    private String light;

    public TrafficLight(String light) {
        this.light = light;
    }

    public void update() {
        switch (light) {
            case "RED":
                light = TrafficLightSignals.GREEN.name();
                break;
            case "GREEN":
                light = TrafficLightSignals.YELLOW.name();
                break;
            case "YELLOW":
                light = TrafficLightSignals.RED.name();
                break;
        }
    }

    public String getLight() {
        return light;
    }
}
