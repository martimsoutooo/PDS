package lab05.Ex2;

public class Pork extends Food {
    public Pork(State state, Temperature temp) {
        super(state, temp);
    }

    @Override
    public String toString() {
        return "Pork: Temperature " + getTemperature() + ", State " + getState();
    }
    
}
