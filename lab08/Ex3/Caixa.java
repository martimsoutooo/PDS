package lab08.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Caixa extends Product {
    private List<Product> contents;

    public Caixa(String name, double weight) {
        super(name, weight);
        this.contents = new ArrayList<>();
    }

    public void add(Product product) {
        contents.add(product);
    }

    public double calculateTotalWeight() {
        double totalWeight = this.getWeight();
        for (Product p : contents) {
            if (p instanceof Caixa) {
                totalWeight += ((Caixa) p).calculateTotalWeight();
            } else { 
                totalWeight += p.getWeight();
            }
        }
        return totalWeight;
    }

    public void draw() {
        draw("");
    }

    private void draw(String indentation) {
        double totalWeight = calculateTotalWeight();
        System.out.println(indentation + "* Caixa '" + this.getName() + "' [ Weight: " + this.getWeight() + " ; Total: " + totalWeight + "]");

        String newIndentation = indentation + "   ";
        for (Product p : contents) {
            if (p instanceof Caixa) {
                ((Caixa) p).draw(newIndentation);
            } else {
                System.out.println(newIndentation + p);
            }
        }
    }
}
