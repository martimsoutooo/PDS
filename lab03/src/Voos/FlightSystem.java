package Voos;

import java.util.Scanner;

public class FlightSystem {
    
         
    public static void menu() {
        Scanner sc = new Scanner(System.in);
    
        while (true) { // Loop infinito controlado pela função menuOptions
            System.out.println("Escolha uma opção (H para ajuda): ");
            String[] option = sc.nextLine().split(" ");
            boolean continueRunning = menuOptions(option);
            if (!continueRunning) {
                break; // Sai do loop se menuOptions retornar false
            }
        }
    
        sc.close();
    }
    

    public static boolean menuOptions(String[] option){
        
        do {
            switch (option[0].toUpperCase().charAt(0)) {
                case 'H':
                    System.out.println("Menu de Ajuda:");
                    System.out.println("- H: Exibe as opções do menu.");
                    System.out.println("- I <arquivo>: Carrega informações de voo de um arquivo.");
                    System.out.println("- M <código_voo>: Mostra mapa de assentos do voo.");
                    System.out.println("- F <código_voo> <lugares_executiva> <lugares_turística>: Adiciona um novo voo.");
                    System.out.println("- R <código_voo> <classe> <nº_assentos>: Faz uma reserva.");
                    System.out.println("- C <código_reserva>: Cancela uma reserva.");
                    System.out.println("- Q: Encerra o programa.");
                    return true;

                case 'I':

                    OptionManager.optionI(option);
                    return true;
                
                case 'M':

                    OptionManager.optionM(option);
                    return true;
                case 'F':

                    OptionManager.optionF(option);
                    return true;
                case 'R':
                        
                    OptionManager.optionR(option);
                    return true;
                case 'C':
                        
                    OptionManager.optionC(option);
                    return true;
                case 'Q':
                    System.out.println("Programa encerrado.");
                    return false;

                default:
                    System.out.println("Opção inválida. Digite 'H' para ajuda.");
                    return true;

            }

        } while (option[0].charAt(0) != 'Q');
        
    }

}
