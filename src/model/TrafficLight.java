package model;

import model.ColorTrafficLight;

public class TrafficLight extends Device {

    private ColorTrafficLight currentColor;

    public TrafficLight(String id, String location) {
        super(id, location);
        this.currentColor = ColorTrafficLight.INTERMITTENT; // Default color, despues hay q ver como lo hacemos para tener en cuenta onda verde y demás
    }

    public ColorTrafficLight getCurrentColor(){
        return currentColor;
    }

    public void setCurrentColor(ColorTrafficLight currentColor){
        this.currentColor = currentColor;
    }

    @Override
    public void simulateOperation() {
        // Se controla desde el ControladorSemaforos
    }
    
}
