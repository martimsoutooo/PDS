public class ListIterator<E> implements java.util.ListIterator<E>{
    private int index;
    private VectorGeneric<E> vec;

    public ListIterator (VectorGeneric<E> vec){
        this.vec = vec;
        this.index = 0;
    }

    public ListIterator (VectorGeneric<E> vec, int index){
        this.vec = vec;
        this.index = index;
    }
    
    public  boolean hasNext() {
        if (index < this.vec.totalElem()) {
            return true;
        }
        return false;
    }
    public  E next() {
        if (this.hasNext()) {
            return this.vec.getElem(index++);
        }
        return null;
    }

    public  int nextIndex() {
        return this.index++;
    }

    public boolean hasPrevious() {
        if (index > 0) {
            return true;
        }
        return false;
    }
    public  E previous() {
        if (this.hasPrevious()) {
            return this.vec.getElem(index--);
        }
        return null;
    }
    
    public  int previousIndex() {
        if (this.hasPrevious()) {
            return this.index--;
        }
        return -1;
    }


    // VectorGeneric already implements this methods
    public  void remove() {
        return;
    }
    public  void set(E e) {
        return;
    }
    public  void add(E e) {
        return;
    }

}
