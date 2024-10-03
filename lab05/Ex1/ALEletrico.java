package lab05.Ex1;

public class ALEletrico extends VeiculoEletrico {
    private int capacidadeBagageira;

    public ALEletrico(String matricula, String marca, String modelo, int potencia, String numQuadro, int autonomia, int percentagemAtual, int capacidadeBagageira) {
        super(matricula, marca, modelo, potencia, numQuadro, autonomia, percentagemAtual);
        this.capacidadeBagageira = capacidadeBagageira;
    }

    public int getCapacidadeBagageira() {
        return capacidadeBagageira;
    }

    public void setCapacidadeBagageira(int capacidadeBagageira) {
        this.capacidadeBagageira = capacidadeBagageira;
    }

    public String toString(){
        return "Matricula: " + this.matricula + ", " + "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Potencia: " + this.potencia + ", " + "Numero de Quadro: " + this.numQuadro + ", " + "Autonomia: " + this.autonomia + ", " + "Percentagem de Bateria " + this.percentagemAtual + ", " + "Numero de Passageiros: " + this.capacidadeBagageira;
    }
}
