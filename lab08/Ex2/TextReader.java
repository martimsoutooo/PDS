package lab08.Ex2;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TextReader implements TextReaderInterface{
    

    private Scanner sc;

    public TextReader(String filename) {
        try {
            sc = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            System.exit(1);
        }
    }

    @Override
    public boolean hasNext() {
        return sc.hasNextLine();
    }
    
    public String next() { 
        if (hasNext()) {
            return sc.nextLine();
        } 
        
        return null;
    }
}
