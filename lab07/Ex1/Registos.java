package Ex1;

import java.util.ArrayList;
import java.util.List;

class Registos {
    private ArrayList<Empregado> empregados;

    public Registos() {
        empregados = new ArrayList<>();
    }

    public void insere(Empregado emp) {
        empregados.add(emp);
    }

    public void remove(int codigo) {
        empregados.removeIf(e -> e.codigo() == codigo);
    }

    public boolean isEmpregado(int codigo) {
        return empregados.stream().anyMatch(e -> e.codigo() == codigo);
    }

    public List<Empregado> listaDeEmpregados() {
        return new ArrayList<>(empregados);
    }
}
