package lab05.Ex2;

public class Milk extends Food{
    public Milk(State state, Temperature temperature) {
        super(state, temperature);
    }

    @Override
    public String toString(){
        return "Milk: Temperature " + this.getTemperature() + ", State " + this.getState();
    }
}
