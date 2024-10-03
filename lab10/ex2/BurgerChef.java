package lab10.ex2;

public class BurgerChef extends Chef {
    public void cook(String request) {
        if (canCook(request, "burguer")) {
            String[] words = request.split(" ");
            String out = "";
            for (int i = 5; i < words.length; i++) {
                out += words[i] + " ";
            }
            System.out.println("BurgerChef: Startig to cook " + out + ". Out in 19 minutes");
        }
        else {
            System.out.println("BurgerChef: I can't cook that.");
            super.cook(request);
        }
    }
}
