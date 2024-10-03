public class Teste {
    public static void main(String[] args) {
        VectorGeneric<String> vec = new VectorGeneric<String>();
        vec.addElem("um");
        vec.addElem("dois");
        vec.addElem("tres");
        vec.addElem("quatro");
        vec.addElem("cinco");
        vec.addElem("seis");
        vec.addElem("sete");
        vec.addElem("oito");
        vec.addElem("nove");
        vec.addElem("dez");
        java.util.ListIterator<String> it = vec.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Remover o elemento \"quatro\"...");
        vec.removeElem("quatro");
        it = vec.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Remover o elemento \"dois\"...");
        vec.removeElem("dois");
        it = vec.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Remover o elemento \"dez\"...");
        vec.removeElem("dez");
        it = vec.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
