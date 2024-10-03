package lab05.Ex2;

public abstract class Food implements Portion {
    private State state;
    private Temperature temperature;

    public Food(State state, Temperature temp){
        this.state = state;
        this.temperature = temp;
    }

    public State getState() {
        return this.state;
    }

    public Temperature getTemperature() {
        return this.temperature;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }
}