package controller;

import javafx.scene.paint.Color;
import model.ColorTrafficLight;
import model.TrafficLight;

public class TrafficLightController {
    //hilo para semáforos hay q modificar y ver como hacer para implementar ondas

    private TrafficLight trafficLightPrimary;
    private TrafficLight trafficLightSecondary;

    public TrafficLightController(TrafficLight trafficLightPrimary, TrafficLight trafficLightSecondary) {
        this.trafficLightPrimary = trafficLightPrimary;
        this.trafficLightSecondary = trafficLightSecondary;
    }

    public void changeTrafficLightState() {
        new Thread(() -> {
            try{
                while(true){
                    trafficLightPrimary.setCurrentColor(ColorTrafficLight.GREEN);
                    trafficLightSecondary.setCurrentColor(ColorTrafficLight.RED);
                    Thread.sleep(40000);
                    trafficLightPrimary.setCurrentColor(ColorTrafficLight.YELLOW);
                    Thread.sleep(4000);
                    
                    trafficLightPrimary.setCurrentColor(ColorTrafficLight.RED);
                    trafficLightSecondary.setCurrentColor(ColorTrafficLight.RED);
                    Thread.sleep(3000);

                    trafficLightSecondary.setCurrentColor(ColorTrafficLight.GREEN);
                    Thread.sleep(40000);

                    trafficLightSecondary.setCurrentColor(ColorTrafficLight.YELLOW);
                    Thread.sleep(4000);

                    trafficLightPrimary.setCurrentColor(ColorTrafficLight.RED);
                    trafficLightSecondary.setCurrentColor(ColorTrafficLight.RED);
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public TrafficLight getTrafficLightPrimary() {
        return trafficLightPrimary;
    }

    public TrafficLight getTrafficLightSecondary() {
        return trafficLightSecondary;
    }
}
