package lab13.XIII1;

public class Car implements Product{
    private String matricula;
    private String modelo;
    private double km;

    public Car(String matricula, String modelo, double km){
        this.matricula = matricula;
        this.modelo = modelo;
        this.km = km;
    }

    public String code(){
        return matricula;
    }

    public String description(){
        return modelo;
    }

    public double points(){
        return km;
    }
}
