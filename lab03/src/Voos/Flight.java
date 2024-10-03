package Voos;

import java.util.Arrays;
import java.util.HashMap;

public class Flight {
    private String flightCode;
    private Plane plane;
    private HashMap<String, Reservation> reservations;
    private boolean hasExecutiveClass;
    private int[][] seatsTouristic;
    private int[][] seatsExecutive;

    // Construtor
    public Flight(String flightCode, Plane plane) {
        this.flightCode = flightCode;
        this.plane = plane;
        this.reservations = new HashMap<>();
        this.initializeSeats();
    }

    
    private void initializeSeats() {
    
        if (plane.getExecutiveRows() > 0) {
            hasExecutiveClass = true;
            seatsExecutive = new int[plane.getExecutiveRows()][plane.getSeatsPerRowOnExecutive()];
        } else {
            
            seatsExecutive = new int[0][0]; 
        }

       
        seatsTouristic = new int[plane.getTouristRows()][plane.getSeatsPerRowOnTourist()];
       
        for (int i = 0; i < seatsExecutive.length; i++) {
            Arrays.fill(seatsExecutive[i], 0);
        }
        for (int i = 0; i < seatsTouristic.length; i++) {
            Arrays.fill(seatsTouristic[i], 0);
        }
    }


    // Métodos para gestão de reservas
    public boolean addReservation(Reservation reservation) {
        boolean isAvailable = checkSeatsAvailability(reservation.getSeatClass(), reservation.getSeats());
        
    
        if (!isAvailable) {
            System.out.println("Não há assentos disponíveis suficientes para a reserva: " + reservation.getSeatClass() + " " + reservation.getSeats());

            return false;
        }
    
        String[] parts = reservation.getReservationCode().split(":");
        int reservationNumber = Integer.parseInt(parts[1]);
        allocateSeats(reservation.getSeatClass(), reservation.getSeats(), reservationNumber);
        reservations.put(reservation.getReservationCode(), reservation);
        return true;
    }
    
    private boolean checkSeatsAvailability(char seatClass, int seatsRequested) {
        int[][] seats = (seatClass == 'E') ? seatsExecutive : seatsTouristic;
        boolean isRowAvailableForAllSeats = false;
    
       
        for (int[] row : seats) {
            if (Arrays.stream(row).allMatch(seat -> seat == 0) && row.length >= seatsRequested) {
                isRowAvailableForAllSeats = true;
                break;
            }
        }
    
        if (isRowAvailableForAllSeats) {
            return true;
        }
    
        
        int seatsAvailable = (int) Arrays.stream(seats).flatMapToInt(Arrays::stream).filter(seat -> seat == 0).count();
    
        return seatsAvailable >= seatsRequested;
    }
    

    private void allocateSeats(char seatClass, int seatsRequested, int reservationNumber) {
        int[][] seats = (seatClass == 'E') ? seatsExecutive : seatsTouristic;
        boolean allocated = false;
    
        
        for (int i = 0; i < seats.length && !allocated; i++) {
            int seatsInRowAvailable = 0;
            for (int seat : seats[i]) {
                if (seat == 0) seatsInRowAvailable++;
            }
    
            if (seatsInRowAvailable >= seatsRequested) { 
                int seatsAllocated = 0;
                for (int j = 0; j < seats[i].length && seatsAllocated < seatsRequested; j++) {
                    if (seats[i][j] == 0) { // Se o assento está disponível
                        seats[i][j] = reservationNumber; 
                        seatsAllocated++;
                    }
                }
                allocated = true; // Marcar que a reserva foi alocada
                break; // Sair do loop, pois a reserva foi alocada com sucesso
            }
        }
    
        
        if (!allocated) {
            int seatsToAllocate = seatsRequested;
            for (int i = 0; i < seats.length && seatsToAllocate > 0; i++) {
                for (int j = 0; j < seats[i].length && seatsToAllocate > 0; j++) {
                    if (seats[i][j] == 0) { // Se o assento está disponível
                        seats[i][j] = reservationNumber; // Alocar
                        seatsToAllocate--;
                    }
                }
            }
        }
    }
    
    
    
    public boolean cancelReservation(String reservationCode) {
        Reservation reservation = reservations.remove(reservationCode);
        if (reservation == null) {
            return false; // Reserva não encontrada
        }
        
        
        releaseSeats(reservationCode);
        return true;
    }
    
  
    private void releaseSeats(String reservationCode) {
        // Extrai o número sequencial da reserva a partir do reservationCode
        String[] parts = reservationCode.split(":");
        int reservationNumber = Integer.parseInt(parts[1]);
    
        // Disponibiliza os assentos marcados com o número da reserva
        for (int[][] seats : new int[][][]{seatsExecutive, seatsTouristic}) {
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[i].length; j++) {
                    if (seats[i][j] == reservationNumber) { // Se o assento está marcado com o número da reserva
                        seats[i][j] = 0; // Assento agora está disponível
                    }
                }
            }
        }
    }
    
    // Exibe o mapa de assentos do voo
    public void showSeatMap() {
        System.out.println("M " + flightCode);
        int maxSeatsPerRow = Math.max(plane.getSeatsPerRowOnExecutive(), plane.getSeatsPerRowOnTourist());
    
        System.out.print("   ");
        for (int i = 1; i <= maxSeatsPerRow; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
    
        if (hasExecutiveClass) {
            for (int row = 0; row < plane.getExecutiveRows(); row++) {
                System.out.printf("%c ", 'A' + row);
                for (int col = 0; col < plane.getSeatsPerRowOnExecutive(); col++) {
                    System.out.printf("%3d", seatsExecutive[row][col]);
                }
                System.out.println();
            }
        }
    
        for (int row = 0; row < plane.getTouristRows(); row++) {
            System.out.printf("%c ", 'A' + (hasExecutiveClass ? plane.getExecutiveRows() + row : row));
            for (int col = 0; col < plane.getSeatsPerRowOnTourist(); col++) {
                System.out.printf("%3d", seatsTouristic[row][col]);
            }
            System.out.println();
        }
    }
    

    public int availableSeats(char seatClass) {
        int available = 0;
        int[][] seats;
        
        // Escolhe a matriz de assentos baseada na classe fornecida
        if (seatClass == 'E' && hasExecutiveClass) {
            seats = seatsExecutive;
        } else {
            seats = seatsTouristic;
        }
        
        // Conta os assentos disponíveis
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) { // 0 indica um assento disponível
                    available++;
                }
            }
        }
        
        return available;
    }
    

    
    public String getFlightCode() {
        return flightCode;
    }


}

