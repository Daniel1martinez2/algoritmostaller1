package controller;

import java.util.ArrayList;
import processing.core.PApplet;
import model.Tesla;
import model.Usuario;

public class Sc1LoginControl {
	Tesla tesla;
	private PApplet app;

	public Sc1LoginControl(PApplet app) {
		this.app = app;
		tesla = new Tesla(app);

	}

	public void getInfoForm(String username, String password, String confirmPassword, String email) {
		tesla.registerUser(username, password, email);

	}

	

}
