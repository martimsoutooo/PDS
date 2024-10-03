package lab12.ex3;

public class Livro {
    private String titulo;
    private String autor;
    private String ano;
    private String ISBN;
    private Estado estado;

    public Livro(String titulo, String autor, String ano, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.ISBN = ISBN;
        this.estado = new Inventário(); 
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getAno() {
        return this.ano;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void newEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void regista() {
        estado.regista(this);
    }

    public void requisita() {
        estado.requisita(this);
    }

    public void devolve() {
        estado.devolve(this);
    }

    public void reserva() {
        estado.reserva(this);
    }

    public void cancelaReserva() {
        estado.cancelaReserva(this);
    }
}

