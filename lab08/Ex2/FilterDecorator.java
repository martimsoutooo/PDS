package lab08.Ex2;

public class FilterDecorator implements TextReaderInterface{
    protected TextReaderInterface textReader;

    public FilterDecorator(TextReaderInterface textReader) {
        this.textReader = textReader;
    }

    @Override
    public boolean hasNext() {
        return textReader.hasNext();
    }

    @Override
    public String next() {
        return textReader.next();
    }
    
}
