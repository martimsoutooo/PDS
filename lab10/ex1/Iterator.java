public class Iterator<E> implements java.util.Iterator<E> {
    private int index;
    private VectorGeneric<E> vec;

    public Iterator (VectorGeneric<E> vec){
        this.vec = vec;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < this.vec.totalElem()) {
            return true;
        }
        return false;
    }
    public E next() {
        if (this.hasNext()) {
            return this.vec.getElem(index++);
        }
        return null;
    }
}
