package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
//... imports class definition...
    
    // Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role    
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    // TODO Auto-generated constructor stub
	public AdminUser(Integer id, String role) {
		super(id, id);
		this.role = role;
		this.securityIncidents = new ArrayList<String>();
	}
	
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if(pin < 100000 || pin > 999999) {
			return false;
		}
		this.pin = pin;
		return true;
	}
	
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if(confirmedAuthID != this.id) {
			this.authIncident();
			return false;
		}
		return true;
	}
	
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return this.securityIncidents;
	}
 

}
