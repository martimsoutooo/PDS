package lab05.Ex2;

public class Tupperware extends Container{
    public Tupperware(Portion menu) {
        super(menu);
    }

    @Override
    public String toString() {
        return "Tupperware with portion = " + getPortion().toString();
    }
}
