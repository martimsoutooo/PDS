package lab08.Ex2;

public class CapitalizationFilter extends FilterDecorator {
    
    public CapitalizationFilter(TextReaderInterface textReader) {
        super(textReader);
    }

    @Override
    public boolean hasNext() {
        return super.hasNext();
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            String returnStr = "";
            String str = super.next();
            char ch[] = str.toCharArray();
            ch[0] = Character.toUpperCase(ch[0]);
            ch[str.length() - 1] = Character.toUpperCase(ch[str.length() - 1]);
            for (char c : ch) {
                returnStr += c;
            }
            return returnStr;
        }
        return null;
    }
}
