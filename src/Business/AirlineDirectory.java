/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Sanjeev MD
 */
public class AirlineDirectory {

    private ArrayList<Airline> airlineList;
    

    public AirlineDirectory() {
        airlineList = new ArrayList<Airline>();
    }

    public Airline addAirLine() {
        Airline airline = new Airline();
        airlineList.add(airline);
        return airline;
    }

    public ArrayList<Airline> getAirLineList() {
        return this.airlineList;
    }

    public int getFleetCount() {
        return airlineList.size();
    }

    public void addAirLine(Airline airline) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
