package lab12.ex3;

public class Inventário implements Estado {
    public void regista(Livro livro) {
        livro.newEstado(new Disponivel());
    }

    public void requisita(Livro livro) {
        System.out.println("Livro não pode ser requisitado.");
    }

    public void devolve(Livro livro) {
        System.out.println("Livro não pode ser devolvido.");
    }

    public void reserva(Livro livro) {
        System.out.println("Livro não pode ser reservado.");
    }

    public void cancelaReserva(Livro livro) {
        System.out.println("Livro não pode ter a reserva cancelada.");
    }

    public String toString() {
        return "[Inventário]";
    }
}
