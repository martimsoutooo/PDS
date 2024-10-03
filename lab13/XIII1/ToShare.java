package lab13.XIII1;

import lab08.Ex3.Product;
import java.util.*;

public class ToShare {

    private ArrayList<Product> products;
    private ArrayList<Client> clients;
    
    ArrayList<Product> actualClientInv;

    public boolean add(Product p){
        try {
            products.add(p);
        } catch (Exception e) {
            System.out.printf("Erro: ",e);
            return false;
        }

        return true;
    }

    public Product remove(String code){
        for (Product product : products){
            if(product.code() == code){
                products.remove(product);
            }
        }
    }

    public boolean share(String code, Client user){
        try {
           for (Product product : products){
                if(product.code() == code){
                    user.addShare(product);
                }
            } 
            return true;
        } catch (Exception e) {
            System.out.printf("Erro: ",e);
            return false;
        }
        

    }
    public boolean share(Product p, Client user){
        try {
            user.addShare(p);
        } catch (Exception e) {
            System.out.printf("Erro: ",e);
            return false;
        }
    }
    public boolean giveBack(String code){
        try {
            for (Client client: clients ){
                actualClientInv = client.getSharedProducts();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public boolean giveBack(Product p){

    }
    public String allAlugados(){

    }
}
