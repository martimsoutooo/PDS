package lab11.ex1;

public class Main {
    public static void main(String[] args) {
        Gestor g1 = new Gestor("Martim");
        Gestor g2 = new Gestor("João");
        Cliente c1 = new Cliente("Rui");
        Cliente c2 = new Cliente("Pedro");
        Cliente c3 = new Cliente("Miguel");
        Cliente clientes[] = {c1, c2, c3};

        Produto p1 = new Produto("Carro", 1000, g1);
        Produto p2 = new Produto("Bicicleta", 100, g1);
        Produto p3 = new Produto("Computador", 500, g1);
        Produto p4 = new Produto("Telemóvel", 200, g1);

        Produto p5 = new Produto("Pulseira", 5, g2);
        Produto p6 = new Produto("Anel", 10, g2);
        Produto p7 = new Produto("Colar", 20, g2);
        Produto p8 = new Produto("Relógio", 50, g2);

        Produto produtosEmLeilao[] = {p1, p3, p5, p6};

        System.out.println("INICIO DO LEILÃO");
        for (Produto p : produtosEmLeilao) {
            p.comecarLeilao(10);
            for (Cliente c : clientes) {
                c.addProdutoLeilao(p);
            }
        }

        System.out.println();

        System.out.println("CONSULTAR INFORMAÇÂO");
        System.out.println("-> COMO CLIENTE");

        c3.consulta();

        System.out.println();
        System.out.println("-> COMO GESTOR");
        g2.getLeilao();
        g1.getStock();

        System.out.println();

        System.out.println("LICITAR");
        c2.licitar(p8, 55); // não está em leilão
        c1.licitar(p1, 800); // preco mais baixo que o inicial
        c3.licitar(p5, 8);
        c1.licitar(p5, 6); // preco mais baixo do que esta

        System.out.println();
        System.out.println("FIM DO LEILÃO");

        for (Produto p : produtosEmLeilao) {
            if (p.leilaoTerminou()) {
                for (Cliente c : clientes) {
                    c.removeProdutoLeilao(p);
                }
            }
        }

        System.out.println();
        g1.getLeilao();
        g2.getLeilao();
        c1.consulta();
    }
}
