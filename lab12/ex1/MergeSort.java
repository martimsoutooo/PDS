package lab12.ex1;

import java.util.ArrayList;

public class MergeSort implements SortStrategy{

    @Override
    public void sort(ArrayList<Telemovel> telemoveis) {
        mergeSort(telemoveis, 0, telemoveis.size() - 1);
        System.err.println("---- Merge Sort ----");
        System.err.println(telemoveis);
    }

    private void mergeSort(ArrayList<Telemovel> telemoveis, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(telemoveis, left, middle);
            mergeSort(telemoveis, middle + 1, right);
            merge(telemoveis, left, middle, right);
        }
    }

    private void merge(ArrayList<Telemovel> telemoveis, int left, int middle, int right) {
        ArrayList<Telemovel> temp = new ArrayList<Telemovel>();
        for (int i = 0; i < telemoveis.size(); i++) {
            temp.add(telemoveis.get(i));
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (temp.get(i).getPreco() <= temp.get(j).getPreco()) {
                telemoveis.set(k, temp.get(i));
                i++;
            } else {
                telemoveis.set(k, temp.get(j));
                j++;
            }
            k++;
        }

        while (i <= middle) {
            telemoveis.set(k, temp.get(i));
            k++;
            i++;
        }
    }
    
}
