package lab05.Ex1;

public abstract class VeiculoEletrico extends Vehicle implements VeiculoEletricoInterface{
    protected int autonomia;
    protected int percentagemAtual;

    public VeiculoEletrico(String matricula, String marca, String modelo, int potencia, String numQuadro, int autonomia, int percentagemAtual) {
        super(matricula, marca, modelo, potencia, numQuadro);
        this.autonomia = autonomia;
        this.percentagemAtual = percentagemAtual;
    }

    public int autonomia() {
        return autonomia;
    }

    public void carregar(int percentagem){
        if( percentagem < percentagemAtual){
            System.out.println("A percentagem de carregamento tem de ser superior a " + percentagemAtual);
        }
        else if(percentagem > 100 || percentagem < 0){
            System.out.println("A percentagem de carregamento tem de ser inferior a 100 e superior a 0");

        }
        else if (percentagemAtual == 100){
            System.out.println("O veiculo já está carregado");
        }
        else{
            autonomia = autonomia * percentagem / percentagemAtual;
            percentagemAtual = percentagem;
            
        }
    }

    @Override
    public void aftertrajeto(int quilometros) {
        if(autonomia - quilometros < 0){
            System.out.println("O veiculo não tem autonomia suficiente para percorrer o trajeto");
        }
        else{
            int autonomiaAntiga = autonomia;
            autonomia -= quilometros;
            percentagemAtual = autonomia * percentagemAtual / autonomiaAntiga;
        }
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getPercentagemAtual() {
        return percentagemAtual;
    }

    public String toString(){
        return "Matricula: " + this.matricula + ", " + "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Potencia: " + this.potencia + ", " + "Numero de Quadro: " + this.numQuadro + ", " + "Autonomia: " + this.autonomia + ", " + "Percentagem de Bateria " + this.percentagemAtual;
    }
}
    

