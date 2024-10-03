package lab05.Ex1;

public class VehicleFactory{
    public static Motociclo createMotociclo(String matricula, String marca, String modelo, int potencia, String tipo){
        return new Motociclo(matricula, marca, modelo, potencia, tipo);
    }
    public static AutomovelLigeiro createAutomovelLigeiro(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacidadeBagageira){
        return new AutomovelLigeiro(matricula, marca, modelo, potencia, numQuadro, capacidadeBagageira);
    }
    public static Taxi createTaxi(String matricula, String marca, String modelo, int potencia, String numQuadro, int capacidadeBagageira, String numLicenca){
        return new Taxi(matricula, marca, modelo, potencia, numQuadro, capacidadeBagageira, numLicenca);
    }
    public static PPEletrico createPPEletrico(String matricula, String marca, String modelo, int potencia, int autonomia, String numQuadro, int percentagemAtual, int numPassageiros, int peso){
        return new PPEletrico(matricula, marca, modelo, potencia, autonomia,numQuadro , percentagemAtual, numPassageiros, peso);
    }
    public static ALEletrico createALEletrico(String matricula, String marca, String modelo, int potencia, String numQuadro, int autonomia, int percentagemAtual, int capacidadeCarga){
        return new ALEletrico(matricula, marca, modelo, potencia, numQuadro, autonomia, percentagemAtual, capacidadeCarga);
    }
    public static PesadoMercadorias createPesadoMercadorias(String matricula, String marca, String modelo, int potencia, String numQuadro, int peso, int cargaMax){
        return new PesadoMercadorias(matricula, marca, modelo, potencia, numQuadro, peso, cargaMax);
    }
    public static PesadoPassageiros createPesadoPassageiros(String matricula, String marca, String modelo, int potencia, int peso,String numQuadro , int numMaxPassageiros){
        return new PesadoPassageiros(matricula, marca, modelo, potencia,peso, numQuadro ,numMaxPassageiros);
    }
}


