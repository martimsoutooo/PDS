package lab12.ex1;

import java.util.ArrayList;

public class BubbleSort implements SortStrategy {

    @Override
    public void sort(ArrayList<Telemovel> telemoveis) {
        int n = telemoveis.size();
        Telemovel temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (telemoveis.get(j - 1).getPreco() > telemoveis.get(j).getPreco()) {
                    temp = telemoveis.get(j - 1);
                    telemoveis.set(j - 1, telemoveis.get(j));
                    telemoveis.set(j, temp);
                }
            }
        }
        System.err.println("---- Bubble Sort ----");
        System.err.println(telemoveis);
    }
}
