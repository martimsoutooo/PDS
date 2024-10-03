package lab05.Ex1;

public class Taxi extends AutomovelLigeiro{
    private String numLicenca;
    private int capacidadeBagageira;

    public Taxi(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacidadeBagageira, String numLicenca) {
        super(matricula, marca, modelo, potencia, numQuadro, capacidadeBagageira);
        this.numLicenca = numLicenca;
    }

    public String getNumLicenca() {
        return numLicenca;
    }

    public void setNumLicenca(String numLicenca) {
        this.numLicenca = numLicenca;
    }

    public String toString(){
        return "Matricula: " + this.matricula + ", " + "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Potencia: " + this.potencia + ", " + "Numero de Quadro: " + this.numQuadro + ", " + "Capacidade da Bagageira: " + this.capacidadeBagageira + ", " + "Numero de Licenca: " + this.numLicenca;
    }
}
