package Ex01;
public class CakeMaster {
   
    private CakeBuilder cakeBuilder;

   
    public void setCakeBuilder(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }

    public Cake getCake() {
        return cakeBuilder.getCake();
    }
    
    public void createCake(String message) {
        cakeBuilder.createCake();
        cakeBuilder.setCakeShape(Shape.CIRCULAR);
        cakeBuilder.addTopLayer();
        cakeBuilder.addTopping();
        cakeBuilder.addMessage(message);
    }

    
    public void createCake(Shape shape, int numLayers, String message) {
        cakeBuilder.createCake();
        cakeBuilder.setCakeShape(shape);
        for (int i = 1; i < numLayers; i++) {
            cakeBuilder.addCakeLayer();
        }
        if (numLayers > 1) {
            cakeBuilder.addCreamLayer();
        }
        cakeBuilder.addTopLayer();
        cakeBuilder.addTopping();
        cakeBuilder.addMessage(message);
    }

    
    public void createCake(int numLayers, String message) {
        cakeBuilder.createCake();
        cakeBuilder.setCakeShape(Shape.CIRCULAR);
        for (int i = 1; i < numLayers; i++) {
            cakeBuilder.addCakeLayer();
        }
        if (numLayers > 1) {
            cakeBuilder.addCreamLayer();
        }
        cakeBuilder.addTopLayer();
        cakeBuilder.addTopping();
        cakeBuilder.addMessage(message);
    }


    
}
