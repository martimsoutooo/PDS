package lab12.ex3;

public class Disponivel implements Estado {
    public void regista(Livro livro) {
        System.out.println("Livro já registado");
    }

    public void requisita(Livro livro) {
        livro.newEstado(new Emprestado());
    }

    public void devolve(Livro livro) {
        System.out.println("Não é possível devolver um livro que está disponível.");
    }

    public void reserva(Livro livro) {
        livro.newEstado(new Reservado());
    }

    public void cancelaReserva(Livro livro) {
        System.out.println("Não é possível cancelar a reserva de um livro que está disponível.");
    }

    public String toString() {
        return "[Disponível]";
    }
}
