package lab05.Ex2;

public class PlasticBottle extends Container{
    public PlasticBottle(Portion menu) {
        super(menu);
    }

    @Override 
    public String toString() {
        return "PlasticBottle with portion = " + getPortion().toString();
    }
}
