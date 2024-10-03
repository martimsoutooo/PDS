package lab05.Ex1;

public class Vehicle implements KmPercorridosInterface{
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int potencia;
    protected String numQuadro;
    protected int distanciaTotalPercorrida;
    protected int ultimoTrajetoPercorrido;

    public void trajeto(int quilometros) {
        this.distanciaTotalPercorrida += quilometros;
        this.ultimoTrajetoPercorrido = quilometros;

        aftertrajeto(quilometros);
    }

    public void aftertrajeto(int quilometros){}
    

    public int ultimoTrajeto() {
        return this.ultimoTrajetoPercorrido;
    }

    public int distanciaTotal() {
        return this.distanciaTotalPercorrida;
    }

    public Vehicle(String matricula, String marca, String modelo, int potencia, String numQuadro){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.numQuadro = numQuadro;
    }

    public Vehicle(String matricula, String marca, String modelo, int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public void setNumQuadro(String numQuadro){
        this.numQuadro = numQuadro;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getPotencia(){
        return this.potencia;
    }
    public String getNumQuadro(){
        return this.numQuadro;
    }
}
