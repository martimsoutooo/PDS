package lab13.XIII1;

import java.util.*;

public class Client{
    private ArrayList<Product> shared;
    private String codigo;
    private String nome;

    public Client(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public ArrayList<Product> getSharedProducts(){
        return shared;
    }

    public void addShare(Product p){
        shared.add(p);
    }

    public void removeShare(Product p){
        shared.remove(p);
    }



}
