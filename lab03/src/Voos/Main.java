package Voos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        if (args.length == 0) {                 
            FlightSystem.menu();                 // Quando não tem o arg com o ficheiro de comandos

        } else if (args.length == 1) {          
                                    // Quando tem o arg com o ficheiro de comandos
            try {
                File fl = new File(args[0]);
                Scanner sc = new Scanner(fl);
    
                while (sc.hasNextLine()) {
                    String option[] = sc.nextLine().split(" ");
                    FlightSystem.menuOptions(option);
                }
    
                sc.close();
    
            } catch (FileNotFoundException e) {
                System.out.println("Ficheiro não existente, tenta outra vez.");
            }

        } else {
            System.out.println("Número inválido de argumentos.");
        }

    }
}
