/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Flight.Flight;
import java.util.ArrayList;

/**
 *
 * @author Sanjeev MD
 */
public class Airline {
    
    public Airline(){
    fleets = new ArrayList<Flight>();
    }
    private String airlineName;
    private String headQuarters;
    private String netIncome;
    private String revenue;
    private String companySlogan;

    public String getHeadQuarters() {
        return headQuarters;
    }

    public void setHeadQuarters(String headQuarters) {
        this.headQuarters = headQuarters;
    }

    public String getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(String netIncome) {
        this.netIncome = netIncome;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getCompanySlogan() {
        return companySlogan;
    }

    public void setCompanySlogan(String companySlogan) {
        this.companySlogan = companySlogan;
    }
    
    private ArrayList<Flight> fleets;
    
    public String getairlineName() {
        return airlineName;
    }

    public void setName(String airlineName) {
        this.airlineName = airlineName;
    }
    
    public Flight addFleet(){
        Flight fleet = new Flight();
        this.fleets.add(fleet);
        return fleet;
    }
    @Override
    public String toString(){
        return this.airlineName;
    }
    
    public int getFleetCount() {
        return fleets.size();
    }
    
    public int getTurnOver(){
        return 0;
    }

}
