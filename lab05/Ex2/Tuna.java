package lab05.Ex2;

public class Tuna extends Food {
    public Tuna(State state, Temperature temp) {
        super(state, temp);
    }

    @Override
    public String toString() {
        return "Tuna: Temperature " + getTemperature() + ", State " + getState();
    }
    
}
