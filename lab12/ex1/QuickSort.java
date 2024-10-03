package lab12.ex1;

import java.util.ArrayList;

public class QuickSort implements SortStrategy{
    
    @Override
    public void sort(ArrayList<Telemovel> telemoveis) {
        quickSort(telemoveis, 0, telemoveis.size() - 1);
        System.err.println("---- Quick Sort ----");
        System.err.println(telemoveis);
    }

    private void quickSort(ArrayList<Telemovel>  telemoveis, int low, int high) {
        if (low < high) {
            int pi = partition(telemoveis, low, high);
            quickSort(telemoveis, low, pi - 1);
            quickSort(telemoveis, pi + 1, high);
        }
    }

    private int partition(ArrayList<Telemovel>  telemoveis, int low, int high) {
        Telemovel pivot = telemoveis.get(high); // Declare and initialize the variable 'pivot'
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (telemoveis.get(j).getPreco() < pivot.getPreco()) {
                i++;
                Telemovel temp = telemoveis.get(i);
                telemoveis.set(i, telemoveis.get(j));
                telemoveis.set(j, temp);
            }
        }
        Telemovel temp = telemoveis.get(i + 1);
        telemoveis.set(i + 1, telemoveis.get(high));
        telemoveis.set(high, temp);
        return i + 1;
    }
    
}
