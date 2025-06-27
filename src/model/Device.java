package model;

public abstract class Device {
    private String id;
    private String location;
    private State state;

    public Device(String id, String location){
        this.id = id;
        this.location = location;
        this.state = State.OPERATIONAL;
    }

    public String getId(){
        return id;
    }

    public String getLocation(){
        return location;
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }

    public abstract void simulateOperation();

}
