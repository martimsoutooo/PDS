package lab12.ex3;

public class Reservado implements Estado {
    public void regista(Livro livro) {
        System.out.println("Livro já registado");
    }

    public void requisita(Livro livro) {
        livro.newEstado(new Emprestado());
    }

    public void devolve(Livro livro) {
        System.out.println("Livro não pode ser devolvido.");
    }

    public void reserva(Livro livro) {
        System.out.println("Livro já reservado");
    }

    public void cancelaReserva(Livro livro) {
        livro.newEstado(new Disponivel());
    }

    public String toString() {
        return "[Reservado]";
    }
}