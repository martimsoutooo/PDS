package lab05.Ex1;

import java.util.ArrayList;

public class Rental {
    private String nome;
    private String codigoPostal;
    private String email;
    private ArrayList <Vehicle> veiculos;

    public Rental(String nome, String codigoPostal, String email){
        this.nome = nome;
        this.codigoPostal = codigoPostal;
        this.email = email;
        this.veiculos = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addVeiculo(Vehicle veiculo){
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Vehicle veiculo){
        veiculos.remove(veiculo);
    }

    public ArrayList<Vehicle> getStock(){
        return veiculos;
    }

    public String toString(){
        return "Empresa: " + this.nome + ", " + "Código Postal: " + this.codigoPostal + ", " + "Email: " + this.email + ", " + "Veiculos: " + this.veiculos;
    }
}
