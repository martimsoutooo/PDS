package lab05.Ex2;

public class FruitJuice extends Food{
    private String FruitName;
    public FruitJuice(String fruit_name, State state, Temperature temperature) {
        super(state, temperature);
        this.FruitName = fruit_name; 
    }
    
    @Override
    public String toString(){
        return "FruitJuice: " + FruitName + ", Temperature " + this.getTemperature() + ", State " + getState();
    }
}
