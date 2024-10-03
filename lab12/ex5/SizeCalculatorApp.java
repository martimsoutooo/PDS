package lab12.ex5;

import java.io.IOException;
import java.nio.file.*;

public class SizeCalculatorApp {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Uso: java lab12.ex5.SizeCalculatorApp [-r] diretório");
            return;
        }

        boolean recursive = false;
        Path rootDir;

        if (args[0].equals("-r")) {
            if (args.length < 2) {
                System.out.println("Uso: java lab12.ex5.SizeCalculatorApp [-r] diretório");
                return;
            }
            recursive = true;
            rootDir = Paths.get(args[1]);
        } else {
            rootDir = Paths.get(args[0]);
        }

        SizeCalculator calculator = new SizeCalculator();
        if (recursive) {
            Files.walkFileTree(rootDir, calculator);
        } else {
            Files.walkFileTree(rootDir, calculator);
        }

        System.out.println("Total: " + calculator.getTotalSize() + " bytes");
    }
}

