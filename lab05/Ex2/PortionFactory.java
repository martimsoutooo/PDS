package lab05.Ex2;

public class PortionFactory {
    public static Food create(String type, Temperature temp) {
        if (type.equals("Beverage")) {
            switch (temp) {
                case WARM:
                    return new Milk(State.Liquid, temp);
                case COLD:
                    return new FruitJuice("orange", State.Liquid, temp);
            }
        }

        if (type.equals("Meat")) {
            switch (temp) {
                case WARM:
                    return new Pork(State.Solid, temp);
                case COLD:
                    return new Tuna(State.Solid, temp);
            }
        }
        else {
            System.err.println("Not a beverage or meat");
            System.exit(1);
        }
        return null;
    }
}
