package lab11.ex1;

import java.util.List;
import java.util.ArrayList;

public class Cliente implements Observer{
    private String nome;
    private List<Produto> produtosObservados = new ArrayList<Produto>();
    private List<Produto> leilao = new ArrayList<Produto>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    public List<Produto> getProdutosObservados() {
        return this.produtosObservados;
    }

    @Override
    public void update(String notification) {
        System.out.println("O cliente " + this.nome + " foi notificado com a mensagem: " + notification);
    }

    public int licitar(Produto produto, double preco) {
        int licitacaoResult = produto.ofertaLicitacao(this, preco);
        if (licitacaoResult == 0) {
            System.out.println(String.format("[%s] ERRO: O produto %s não está em leilão.", this.nome, produto.getDescricao()));
            return 0;
        }
        else if (licitacaoResult == 2) {
            produtosObservados.add(produto);
            return 0;
        }
        return 1;
    }

    public void consulta() {
        System.out.println("Produtos em Leilão:");
        System.out.println(getLeilao());
    }

    public List<Produto> getLeilao() {
        return this.leilao;
    }

    public void addProdutoLeilao(Produto produto) {
        this.leilao.add(produto);
    }

    public void removeProdutoLeilao(Produto produto) {
        this.leilao.remove(produto);
    }

}
