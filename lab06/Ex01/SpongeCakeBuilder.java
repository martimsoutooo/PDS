package Ex01;
public class SpongeCakeBuilder implements CakeBuilder {
    
    private Cake spongeCake;

    public void setCakeShape(Shape shape) {
        spongeCake.setShape(shape);
    }

    public void addCakeLayer() {
        spongeCake.addLayer();
    }

    public void addCreamLayer() {
        spongeCake.setMidLayerCream(Cream.RED_BERRIES);
    }

    public void addTopLayer() {
        spongeCake.setTopLayerCream(Cream.WHIPPED_CREAM);
    }

    public void addTopping() {
        spongeCake.setTopping(Topping.FRUIT);
    }

    public void addMessage(String m) {
        spongeCake.setMessage(m);
    }


    public void createCake() {
        spongeCake = new Cake("Sponge");
        addTopping();
        addTopLayer();
        addCreamLayer();
    }

  
    public Cake getCake() {
        return spongeCake;
    }
}
