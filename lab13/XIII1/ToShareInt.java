package lab13.XIII1;

public interface ToShareInt {
    public boolean add(Product p);
    public Product remove(String code);
    public boolean share(String code, Client user);
    public boolean share(Product p, Client user);
    public boolean giveBack(String code);
    public boolean giveBack(Product p);
    public String allAlugados();
}
