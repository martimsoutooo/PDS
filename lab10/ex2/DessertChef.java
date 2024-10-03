package lab10.ex2;

public class DessertChef extends Chef {
    public void cook(String request) {
        if (canCook(request, "dessert")) {
            String[] words = request.split(" ");
            String out = "";
            for (int i = 5; i < words.length; i++) {
                out += words[i] + " ";
            }
            System.out.println("DessertChef: Startig to cook " + out + ". Out in 17 minutes");
        }
        else {
            System.out.println("DessertChef: I can't cook that.");
            super.cook(request);
        }
    }
    
}
