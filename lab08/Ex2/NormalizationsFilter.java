package lab08.Ex2;

import java.text.Normalizer;

public class NormalizationsFilter extends FilterDecorator{

    public NormalizationsFilter(TextReaderInterface textReader) {
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
            returnStr = Normalizer.normalize(returnStr, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
            return returnStr;
        }
        return null;
    }
}
