package lab05.Ex2;

public class TermicBottle extends Container {
    public TermicBottle(Portion menu) {
        super(menu);
    }
    
    @Override
    public String toString(){
        return "TermicBottle with portion = " + getPortion().toString();
    }
}
