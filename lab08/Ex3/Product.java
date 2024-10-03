package lab08.Ex3;

public abstract class Product {
    private String name;
    private double weight;

    public Product(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void draw();

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " '" + this.name + "' - Weight : " + this.weight;
    }
}

   
