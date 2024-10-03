package lab08.Ex3;

public class Bebida extends Product {
    public Bebida(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}