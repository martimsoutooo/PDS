package lab12.ex3;

public class Emprestado implements Estado {
    public void regista(Livro livro) {
        System.out.println("Livro já registado");
    }

    public void requisita(Livro livro) {
        System.out.println("Livro já requisitado");
    }

    public void devolve(Livro livro) {
        livro.newEstado(new Disponivel());
    }

    public void reserva(Livro livro) {
        System.out.println("Livro já requisitado");
    }

    public void cancelaReserva(Livro livro) {
        System.out.println("Não é possível cancelar a reserva de um livro que está emprestado.");
    }

    public String toString() {
        return "[Emprestado]";
    }
}