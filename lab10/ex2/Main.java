package lab10.ex2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> requests = new ArrayList<String>();

        requests.add("Can I please get a veggie burger?");
        requests.add("Can I please get a Pasta Carbonara?");
        requests.add("Can I please get a PLAIN pizza, no toppings!?");
        requests.add("Can I please get a sushi nigiri and sashimi?");
        requests.add("Can I please get a salad with tuna? ");
        requests.add("Can I please get a strawberry ice cream and waffles dessert?");

        Chef chef = new SushiChef().setNextChef(
            new PastaChef().setNextChef(
                new BurgerChef().setNextChef(
                    new PizzaChef().setNextChef(
                        new DessertChef()
                    )
                )
            )
        );

        for (String request : requests) {
            System.out.println(request);
            chef.cook(request);
            System.out.println();
        }
    }
    
}
