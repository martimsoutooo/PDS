package lab10.ex2;

public class PizzaChef extends Chef {
    public void cook(String request) {
        if (canCook(request, "pizza")) {
            String[] words = request.split(" ");
            String out = "";
            for (int i = 5; i < words.length; i++) {
                out += words[i] + " ";
            }
            System.out.println("PizzaChef: Startig to cook " + out + ". Out in 7 minutes");
        }
        else {
            System.out.println("PizzaChef: I can't cook that.");
            super.cook(request);
        }
    }
}
