package Ex01;
public class YogurtCakeBuilder implements CakeBuilder {
  
    private Cake yogurtCake;

   
    public void setCakeShape(Shape shape) {
        yogurtCake.setShape(shape);
    }

    public void addCakeLayer() {
        yogurtCake.addLayer();
    }

    public void addCreamLayer() {
        yogurtCake.setMidLayerCream(Cream.VANILLA);
    }

    public void addTopLayer() {
        yogurtCake.setTopLayerCream(Cream.RED_BERRIES);
    }

    public void addTopping() {
        yogurtCake.setTopping(Topping.CHOCOLAT);
    }

    public void addMessage(String m) {
        yogurtCake.setMessage(m);
    }

   
    public void createCake() {
        yogurtCake = new Cake("Yogurt");
        addTopping();
        addTopLayer();
        addCreamLayer();
    }


    public Cake getCake() {
        return yogurtCake;
    }
}