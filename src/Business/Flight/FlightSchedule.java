/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Flight;

import Business.Seat.SeatClass;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Sanjeev MD
 */
public class FlightSchedule {
    
    private String from;
    
    private String to;
    
    private LocalDateTime departureTime;
    
    private LocalDateTime ArrivalTime;
    
    private LocalDateTime hours;
    
    private ArrayList<SeatClass> businessClassBooked;
    
    private ArrayList<SeatClass> economyClassBooked;
    
    private ArrayList<SeatClass> firstClassBooked;    
}
