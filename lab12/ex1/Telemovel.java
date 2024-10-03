package lab12.ex1;

public class Telemovel {
    private String marca; 
    private String processador;
    private double preco;
    private int memoria;
    private String camara;

    public Telemovel(String marca, String processador, double preco, int memoria, String camara) {
        this.marca = marca;
        this.processador = processador;
        this.preco = preco;
        this.memoria = memoria;
        this.camara = camara;
    }

    public String getMarca() {
        return marca;
    }

    public String getProcessador() {
        return processador;
    }

    public double getPreco() {
        return preco;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getCamara() {
        return camara;
    }

    public String toString() {
        return "Telemovel: marca=" + marca + ", processador=" + processador + ", preco=" + preco + ", memoria=" + memoria + ", camara=" + camara;

    }
}
