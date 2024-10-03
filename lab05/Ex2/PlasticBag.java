package lab05.Ex2;

public class PlasticBag extends Container{
    public PlasticBag(Portion menu) {
        super(menu);
    }

    @Override
    public String toString() {
        return "PlasticBag with portion = " + getPortion().toString();
    }
    
}
