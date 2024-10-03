package lab11.ex1;

import java.util.Map;
import java.util.HashMap;

public class Produto {
    private int id = 1;
    private String descricao;
    private double precoInicial;
    private Gestor gestor;
    private State estado;
    private double tempoLeilao;
    private double inicioLeilao;
    private double novoPreco;
    private HashMap<Cliente, Double> licitacoes = new HashMap<Cliente, Double>();


    public Produto(String descricao, double precoInicial, Gestor gestor) {
        this.id++;
        this.descricao = descricao;
        this.precoInicial = precoInicial;
        this.gestor = gestor;
        this.estado = State.STOCK;
        this.tempoLeilao = 0;
        this.novoPreco = precoInicial;
        gestor.addProdutoStock(this);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public double getPrecoInicial() {
        return this.precoInicial;
    }

    public double getNovoPreco() {
        return this.novoPreco;
    }

    public State getEstado() {
        return this.estado;
    }

    public void setNovoPreco(double novoPreco) {
        this.novoPreco = novoPreco;
    }


    public void comecarLeilao(double tempoLeilao) {
        this.estado = State.LEILÃO;
        this.tempoLeilao = tempoLeilao;
        this.inicioLeilao = System.currentTimeMillis();
        gestor.addProdutoLeilao(this);
        gestor.removeProdutoStock(this);
        gestor.update(String.format("[%s] entrou em leilão.", this.descricao));
    }

    public boolean leilaoTerminou() {
        long tempo = System.currentTimeMillis();
        double tempoLicitacao = (tempo - this.inicioLeilao);
        if (tempoLicitacao > this.tempoLeilao) {
            if (this.estado == State.LEILÃO) {
                terminarLeilao();
                return true;
            }
            return true;
        }
        return false;
    }

    public void terminarLeilao() {
        if (licitacoes.size() == 0) {
            gestor.addProdutoStock(this);
            gestor.removeProdutoLeilao(this);
            gestor.update(String.format("[%s] não foi vendido.", this.descricao));
        }
        else {
            if (novoPreco > precoInicial) {
                this.estado = State.VENDIDO;
                gestor.removeProdutoLeilao(this);
                gestor.addProdutoVendido(this);
                gestor.update(String.format("[%s] foi vendido por %f.", this.descricao, this.novoPreco));
            }
            estado = State.STOCK;
            gestor.addProdutoStock(this);
            gestor.removeProdutoLeilao(this);
            gestor.update(String.format("[%s] não foi vendido. Adicionado ao stock", this.descricao));
        }

        for (Map.Entry<Cliente, Double> entry : licitacoes.entrySet()) {
            licitacoes.put(entry.getKey(), entry.getValue());
            System.out.println("removido");
        }
    }

    public int ofertaLicitacao(Cliente cliente, double preco) {
        long tempo = System.currentTimeMillis();
        double tempoLicitacao = (tempo - this.inicioLeilao);
        if (this.estado == State.LEILÃO) {
            if (tempoLicitacao > this.tempoLeilao) {
                terminarLeilao();
                return 1;
            }
            else {
                if (preco > this.novoPreco) {
                    licitacoes.put(cliente, preco);
                    setNovoPreco(preco);
                    gestor.update(String.format("[%s] nova licitação de %s por %f.", this.descricao, cliente.getNome(), preco));

                    for (Map.Entry<Cliente, Double> entry : licitacoes.entrySet()) {
                        entry.getKey().update(String.format("[%s] nova licitação de %s por %f.", this.descricao, cliente.getNome(), preco));
                    }
                    return 2;
                }
                else {
                    gestor.update(String.format("[%s] nova licitação de %s por %f., não aceite", this.descricao, cliente.getNome(), preco));
                    cliente.update((String.format("Solicitção não aceito, preço demasiado baixo. Preço atual de %s: %f", this.descricao, this.novoPreco)));
                    return 1;
                }
            }
        }
        return 0;
    }

    public String toString() {
        return String.format("Produto: %s, Preço Inicial: %f, Estado: %s, Gestor: %s, Num de clinetes interessados: %d", this.descricao, this.precoInicial, this.estado, this.gestor.toString(), this.licitacoes.size());
    }

}