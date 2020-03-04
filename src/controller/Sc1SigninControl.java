package controller;
import model.Tesla;
public class Sc1SigninControl {
	private Tesla tesla; 
	public Sc1SigninControl() {
		tesla = new Tesla(); 
		
	}
	public void getInfoForm(String username, String password, String confirmPassword, String email) {
		tesla.registerUser(username,password,email);
	}

}


