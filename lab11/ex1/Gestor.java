package lab11.ex1;

import java.util.List;
import java.util.ArrayList;

public class Gestor implements Observer{
    private String nome;
    private List<Produto> stock;
    private List<Produto> leilao;
    private List<Produto> vendidos;

    public Gestor(String nome) {
        this.nome = nome;
        this.stock = new ArrayList<Produto>();
        this.leilao = new ArrayList<Produto>();
        this.vendidos = new ArrayList<Produto>();
    }

    public String getNome() {
        return this.nome;
    }

    public List<Produto> getStock() {
        return this.stock;
    }

    public List<Produto> getLeilao() {
        return this.leilao;
    }

    public List<Produto> getVendidos() {
        return this.vendidos;
    }

    public void addProdutoStock(Produto produto) {
        this.stock.add(produto);
    }

    public void addProdutoLeilao(Produto produto) {
        this.leilao.add(produto);
    }

    public void addProdutoVendido(Produto produto) {
        this.vendidos.add(produto);
    }

    public void removeProdutoStock(Produto produto) {
        this.stock.remove(produto);
    }

    public void removeProdutoLeilao(Produto produto) {
        this.leilao.remove(produto);
    }

    public void update(String notification) {
        System.out.println("[" + this.nome + "] recebeu uma notificação: " + notification);
    }

    public String toString() {
        return "Gestor: " + this.nome;
    }
}
