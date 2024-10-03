package lab10.ex2;

public abstract class Chef {
    // handler
    Chef nextChef = null;

    public void cook(String request) {
        if (nextChef != null) {
            nextChef.cook(request);
        }
        else {
            System.out.println(" We're sorry but that request can't be satisfied by our service!");

        }
    }

    protected boolean canCook(String request, String foodType) {
        // canHandle
        return (request == null) || request.contains(foodType);
    }

    public Chef setNextChef(Chef nextChef) {
        // nextHandler
        this.nextChef = nextChef;
        return this;
    }
}
