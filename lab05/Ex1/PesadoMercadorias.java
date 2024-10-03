package lab05.Ex1;

public class PesadoMercadorias extends Vehicle {
    private int peso;
    private int cargaMax;
    public PesadoMercadorias(String matricula, String marca, String modelo, int potencia, String numQuadro, int peso, int cargaMax) {
        super(matricula, marca, modelo, potencia, numQuadro);
        this.peso = peso;
        this.cargaMax = cargaMax;
    }

    public int getPeso() {
        return peso;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    
    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String toString(){
        return "Matricula: " + this.matricula + ", " + "Marca: " + this.marca + ", " + "Modelo: " + this.modelo + ", " + "Potencia: " + this.potencia + ", " + "Numero de Quadro: " + this.numQuadro + ", " + "Peso: " + this.peso + ", " + "Carga Maxima: " + this.cargaMax;
    }
}
