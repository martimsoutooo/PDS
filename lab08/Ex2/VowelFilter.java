package lab08.Ex2;

public class VowelFilter extends FilterDecorator{

    public VowelFilter(TextReaderInterface textReader) {
        super(textReader);
    }

    @Override
    public boolean hasNext() {
       return super.hasNext(); 
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            String returnStr = super.next();
            returnStr = returnStr.replaceAll("[aeiouAEIOU]", "");
            return returnStr;
        }
        return null;
    }
}
