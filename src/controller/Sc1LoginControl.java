package controller;

import model.Tesla;

public class Sc1LoginControl {
	Tesla tesla; 
	
	public Sc1LoginControl() {
		tesla = new Tesla() {}; 
		
	}
	
	
	
	
	
	public void getInfoForm(String username, String password, String confirmPassword, String email) {
		tesla.registerUser(username,password,email);
	}

}
