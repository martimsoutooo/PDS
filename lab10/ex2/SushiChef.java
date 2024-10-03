package lab10.ex2;

public class SushiChef extends Chef {

    public void cook(String request) {
        if (canCook(request, "sushi")) {
            String[] words = request.split(" ");
            String out = "";
            for (int i = 5; i < words.length; i++) {
                out += words[i] + " ";
            }
            System.out.println("SushiChef: Startig to cook " + out + ". Out in 14 minutes");
        }
        else {
            System.out.println("SushiChef: I can't cook that.");
            super.cook(request);
        }
    }
}
