package controller;
import model.Tesla;

public class HomeControl {
	 Tesla tesla; 
		
	public HomeControl() {
		tesla = new Tesla(); 
		
	}
	
	
	
	public void nombres() {
		for (int i = 0; i < tesla.getUsuarios().size(); i++) {
			tesla.getUsuarios().get(i).getUsername(); 
		}
		
		
	}
	
	
	
	
}


