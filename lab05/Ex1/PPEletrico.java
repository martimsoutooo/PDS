package lab05.Ex1;

public class PPEletrico extends  VeiculoEletrico {
    private int numPassageiros;
    private int peso;

    public PPEletrico(String matricula, String marca, String modelo, int potencia, int autonomia,String numQuadro , int percentagemAtual, int numPassageiros, int peso) {
        super(matricula, marca, modelo, potencia, numQuadro, autonomia, percentagemAtual);
        this.numPassageiros = numPassageiros;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public String toString(){
        return "Matricula: " + this.matricula + ", " + "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Potencia: " + this.potencia + ", " + "Numero de Quadro: " + this.numQuadro + ", " + "Autonomia: " + this.autonomia + ", " + "Percentagem de Bateri " + this.percentagemAtual+ ", " + "Numero de Passageiros: " + this.numPassageiros + ", " + "Peso: " + this.peso ;
    }

}
