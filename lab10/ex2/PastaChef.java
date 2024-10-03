package lab10.ex2;

public class PastaChef extends Chef {

    public void cook(String request) {
        if (canCook(request, "Pasta")) {
            String[] words = request.split(" ");
            String out = "";
            for (int i = 5; i < words.length; i++) {
                out += words[i] + " ";
            }
            System.out.println("PastaChef: Startig to cook " + out + ". Out in 14 minutes");
        }
        else {
            System.out.println("PastaChef: I can't cook that.");
            super.cook(request);
        }
    }
    
}
