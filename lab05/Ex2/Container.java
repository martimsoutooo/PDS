package lab05.Ex2;

public class Container {
    private Portion portion;

    public Container(Portion menu) {
        this.portion = menu;
    }

    public Portion getPortion() {
        return portion;
    }

    public static Container create(Portion menu) {
        switch (menu.getState()) {
            case Liquid:
                if(menu.getTemperature() == Temperature.COLD) {
                    return new PlasticBottle(menu);
                }
                else {
                    return new TermicBottle(menu);
                }
            case Solid:
                if (menu.getTemperature() == Temperature.COLD) {
                    return new PlasticBag(menu);
                }
                else {
                    return new Tupperware(menu);
                }
        }
        return null;
    } 
}
