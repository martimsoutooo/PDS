package Ex01;

public class ChocolateCakeBuilder implements CakeBuilder {
  
    private Cake chocolateCake;

 
    public void setCakeShape(Shape shape) {
        chocolateCake.setShape(shape);
    }

    public void addCakeLayer() {
        chocolateCake.addLayer();
    }

    public void addCreamLayer() {
        chocolateCake.setMidLayerCream(Cream.NULL);
    }

    public void addTopLayer() {
        chocolateCake.setTopLayerCream(Cream.WHIPPED_CREAM);
    }

    public void addTopping() {
        chocolateCake.setTopping(Topping.FRUIT);
    }

    public void addMessage(String m) {
        chocolateCake.setMessage(m);
    }

  
    public void createCake() {
        chocolateCake = new Cake("Soft chocolate");
        addTopping();
        addTopLayer();
        addCreamLayer();
    }

    
    public Cake getCake() {
        return chocolateCake;
    }
}
