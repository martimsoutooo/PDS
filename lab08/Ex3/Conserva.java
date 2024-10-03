package lab08.Ex3;

public class Conserva extends Product {
    public Conserva(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}