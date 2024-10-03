public interface IVectorGeneric<E> {
    
    public java.util.Iterator<E> Iterator();
    public java.util.ListIterator<E> listIterator();
    public java.util.ListIterator<E> listIterator(int index); // start at index
}
