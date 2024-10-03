package lab12.ex1;

import java.util.ArrayList;

public class Context {
    private SortStrategy strategy;
    private ArrayList<Telemovel> telemoveis;

    public Context(SortStrategy strategy, ArrayList<Telemovel> telemoveis) {
        this.strategy = strategy;
        this.telemoveis = new ArrayList<Telemovel>(telemoveis); // Copia os dados da lista passada
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setTelemoveis(ArrayList<Telemovel> telemoveis) {
        this.telemoveis = new ArrayList<Telemovel>(telemoveis); // Copia os dados da nova lista passada
    }

    public void sort() {
        strategy.sort(telemoveis);
    }
}

