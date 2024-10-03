package lab12.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Telemovel> telemoveis = new ArrayList<Telemovel>();
        telemoveis.add(new Telemovel("Samsung", "Exynos 2100", 999.99, 8, "108 MP"));
        telemoveis.add(new Telemovel("Apple", "A14 Bionic", 1099.99, 6, "12 MP"));
        telemoveis.add(new Telemovel("Xiaomi", "Snapdragon 888", 799.99, 8, "108 MP"));
        telemoveis.add(new Telemovel("OnePlus", "Snapdragon 888", 899.99, 8, "48 MP"));
        telemoveis.add(new Telemovel("Huawei", "Kirin 9000", 1199.99, 8, "50 MP"));

        SortStrategy bubbleSort = new BubbleSort();
        SortStrategy mergeSort = new MergeSort();
        SortStrategy quickSort = new QuickSort();


        Context context = new Context(bubbleSort, telemoveis);
        context.sort();

        System.out.println();
        context.setStrategy(mergeSort);
        context.sort();

        System.out.println();
        context.setStrategy(quickSort);
        context.sort();
    }
}
