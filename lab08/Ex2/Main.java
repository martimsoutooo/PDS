package lab08.Ex2;


public class Main {
    public static void main(String[] args) {

        String filename = "./lab08/Ex2/text.txt";

        System.out.println();

        System.out.println("---------- Text Reader ----------");
        TextReaderInterface textReader = new TextReader(filename);
        System.out.println("P1 -> " + textReader.next());
        System.out.println("P2 -> " + textReader.next());
        System.out.println("P3 -> " + textReader.next()); // P3 -> null

        System.out.println();

        System.out.println("---------- Term Filter ----------");
        TermFilter termFilter = new TermFilter(new TextReader(filename));
        System.out.println("W1 -> " + termFilter.next());
        System.out.println("W2 -> " + termFilter.next());
        System.out.println("W3 -> " + termFilter.next()); 
        System.out.println("W4 -> " + termFilter.next());
        System.out.println("W5 -> " + termFilter.next());
        System.out.println("W6 -> " + termFilter.next());

        System.out.println();

        System.out.println("---------- Normalization Filter ----------");
        NormalizationsFilter normalizationsFilter = new NormalizationsFilter(new TextReader(filename));
        System.out.println(normalizationsFilter.next());
        System.out.println(normalizationsFilter.next());
        System.out.println(normalizationsFilter.next());

        System.out.println();

        System.out.println("---------- Vowel Filter ----------");
        VowelFilter vowelFilter = new VowelFilter(new NormalizationsFilter(new TextReader(filename)));
        System.out.println(vowelFilter.next());
        System.out.println(vowelFilter.next());
        System.out.println(vowelFilter.next());

        System.out.println();

        System.out.println("---------- Capitalization Filter ----------");
        CapitalizationFilter capitalizationFilter = new CapitalizationFilter(new TextReader(filename));
        System.out.println(capitalizationFilter.next());
        System.out.println(capitalizationFilter.next());
        System.out.println(capitalizationFilter.next());
        


        
        


    }
}
