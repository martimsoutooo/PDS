package Voos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class OptionManager {
    private static HashMap<String, Flight> flights = new HashMap<>();
    static int args;
    public static boolean optionI(String[] option) {
        args = 2;
        if (!validNumArgs(option[0].toUpperCase().charAt(0), args)) {
            return true;
        }
        try {
            File file = new File(option[1]);
            Scanner reader = new Scanner(file);
    
            Flight flight = null;
    
            if (reader.hasNextLine()) {
                String line = reader.nextLine().trim(); 
                if (!line.startsWith(">")) { 
                    System.err.println("Formato de arquivo inválido. Esperado '>' no início do código do voo.");
                    reader.close();
                    return true;
                }
    
                String[] flightInfo = line.substring(1).split(" ");
                if (!validFlightCode(flightInfo[0])) {
                    System.err.println("Erro: Formato de código de voo inválido.");
                    reader.close();
                    return true;
                }
    
                String flightCode = flightInfo[0];
                Plane plane;

                // Verificar se existe classe executiva
                if (flightInfo.length == 3) {
                    int[] execConfig = splitSeatsFormat(flightInfo[1]);
                    int[] turConfig = splitSeatsFormat(flightInfo[2]);
                    plane = new Plane(turConfig[0], turConfig[1], execConfig[0], execConfig[1]);
                
                    
                    System.out.printf("Lugares disponíveis: %d lugares em classe Executiva; %d lugares em classe Turística.\n", 
                                      plane.getAvailableExecutiveSeats(), 
                                      plane.getAvailableTouristicSeats());

                } else {
                    // Apenas classe turística
                    int[] turConfig = splitSeatsFormat(flightInfo[1]);
                    plane = new Plane(turConfig[0], turConfig[1]); 
                
                    
                    System.out.printf("Lugares disponíveis: %d lugares em classe Turística.\n", 
                                      plane.getAvailableTouristicSeats());

                }
                
    
                flight = new Flight(flightCode, plane);
                flights.put(flightCode, flight); // Adiciona o voo ao sistema
            }
            
            
    
            // Processa as reservas do ficheiro
            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                String[] reservationInfo = line.split(" ");
                char seatClass = reservationInfo[0].charAt(0); // E ou T
                int numSeats = Integer.parseInt(reservationInfo[1]);
    
                // Verifica se o voo foi criado corretamente antes de tentar adicionar reservas
                if (flight != null) {
                    flight.addReservation(new Reservation(flight.getFlightCode(), numSeats, seatClass));
                }
            }
    
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado.");
        }

        return true;
    }

    public static boolean optionM(String[] option) {
        args = 2;
        if (!validNumArgs(option[0].toUpperCase().charAt(0), args)) {
            return true;
        } else {
            String flightCode = option[1];
            if (validFlightCode(flightCode)) {
                Flight flightToShow = flights.get(flightCode);
                if (flightToShow != null) {
                    flightToShow.showSeatMap();
                } else {
                    System.out.println("Erro: Voo não encontrado.");
                }
            } else {
                System.err.println("Erro: Formato de código de voo inválido.");
            }
        }
        return true;
    }

    public static boolean optionF(String[] option) {
        // Verifica se o voo irá ter classe executiva ou não 
        if (option.length == 4 || option.length == 3) {
            String flightCode = option[1];

            // Verifica se o formato do código do voo é válido
            if (!validFlightCode(flightCode)) {
                System.err.println("Erro: Formato de código de voo inválido.");
                return true;
            }

            try {
                Plane plane;
                // Com classe executiva
                if (option.length == 4) {
                    int[] execSeats = splitSeatsFormat(option[2]);
                    int[] turSeats = splitSeatsFormat(option[3]);
                    plane = new Plane(turSeats[0], turSeats[1], execSeats[0], execSeats[1]);
                } else {
                    // Sem classe executiva
                    int[] turSeats = splitSeatsFormat(option[2]);
                    plane = new Plane(turSeats[0], turSeats[1]);
                }

                // Adiciona o novo voo ao sistema
                Flight newFlight = new Flight(flightCode, plane);
                flights.put(flightCode, newFlight);
                System.out.println("Voo adicionado com sucesso: " + flightCode);

            } catch (NumberFormatException e) {
                System.err.println("Erro: Formato numérico inválido nos argumentos.");
            }

        } else {
            System.err.println("Erro: Número de argumentos inválido para adicionar um voo.");
        }

        return true;
    }
    
    public static boolean optionR(String[] option) {
        args = 4;
        if (!validNumArgs(option[0].toUpperCase().charAt(0), args)) {
            return true;
        } else {
            String flightCode = option[1];
            char seatClass = option[2].charAt(0); 
            int numSeats;
        
            try {
                numSeats = Integer.parseInt(option[3]);
            } catch (NumberFormatException e) {
                System.err.println("Erro: O número de assentos deve ser um inteiro válido.");
                return true;
            }
        
            if (!validFlightCode(flightCode)) {
                System.err.println("Erro: Formato de código de voo inválido.");
                return true;
            }
        
            Flight flight = flights.get(flightCode);
            if (flight == null) {
                System.out.println("Erro: Voo não encontrado.");
                return true;
            }
        
            // Cria uma nova reserva e tenta adicioná-la ao voo
            Reservation reservation = new Reservation(flightCode, numSeats, seatClass);
            if (flight.addReservation(reservation)) {
                System.out.println("Reserva adicionada com sucesso. Código da reserva: " + reservation.getReservationCode());
            } 
        }

        return true;
    }
    
    public static boolean optionC(String[] option) {
        args = 2;

        if (!validNumArgs(option[0].toUpperCase().charAt(0), args)) {
            return true;
        }else {
            String reservationCode = option[1];
            String[] parts = reservationCode.split(":");
            if (parts.length != 2) {
                System.err.println("Erro: Formato de código de reserva inválido.");
                return true;
            }
            String flightCode = parts[0];
                
            Flight flight = flights.get(flightCode);
            if (flight == null) {
                System.err.println("Erro: Voo não encontrado.");
                return true;
            }
                
            // Tenta cancelar a reserva
            boolean reservationCancelled = flight.cancelReservation(reservationCode);
            if (reservationCancelled) {
                System.out.println("Reserva cancelada com sucesso: " + reservationCode);
            } else {
                System.out.println("Erro ao cancelar a reserva. Pode não existir ou já foi cancelada.");
            }
        }

        return true;
    }

    public static boolean validFlightCode(String flightCode) {
        String pattern = "^[A-Z]{2}\\d{4}$";
        return flightCode.matches(pattern);
    }


    public static boolean verifyHasExecutiveSeats(String[] firstLine){
        if (firstLine.length == 3){
            return true;
        }
        else{
            return false;
        }
    }

    public static int[] splitSeatsFormat(String seats){
        String[] temp;

        try {
            temp = seats.split("x");
            int filas = Integer.parseInt(temp[0]);
            int lugares = Integer.parseInt(temp[1]);

            if (filas < 1 || lugares < 1){
                throw new NumberFormatException();
            }

            return new int[] {filas,lugares};
        } catch (NumberFormatException e) {
            System.out.println("Erro: O parâmetro deve ter dois inteiros (maiores que zero) separados por 'x'.");
            return null;
        }

    }

    public static boolean validNumArgs(char option, int args){
        if(option == "I".charAt(0) || option == "C".charAt(0) || option == "M".charAt(0)){
            if(args == 2){
                return true;
            }
            else{
                System.out.println("ERRO: Número de argumentos inválido");
                return false;
            }
        }
        else{
            if(args == 4){
                return true;
            }
            else{
                System.out.println("ERRO: Número de argumentos inválido");
                return false;
            }
        }
        
    }
}
