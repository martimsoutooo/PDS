package lab08.Ex3;

public class Doce extends Product {
    public Doce(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}
