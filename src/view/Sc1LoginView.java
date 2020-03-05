package view;

import controller.Sc1LoginControl;
import controller.Sc1SigninControl;
import processing.core.PApplet;
import processing.core.PImage;
import controlP5.*;
import processing.core.PFont;



public class Sc1LoginView {
	private String username, password, confirmPassword, email;
	private PApplet app;
	private ControlP5 cp5;
	private String[] inputs;
	private Sc1LoginControl sc1logincontrol;
	

	
	Sc1LoginControl sc1login;
	

	public Sc1LoginView(PApplet app) {
	
		sc1login = new Sc1LoginControl();
		
		
		this.app = app; 
		cp5 = new ControlP5(app);
		//img1 = app.loadImage("img/img1.png"); 
		inputs = new String[4];
		inputs[0] = "username";
		inputs[1] = "password";
		inputs[2] = "confirmPassword";
		inputs[3] = "email";

		for (int i = 0; i < inputs.length; i++) {
			cp5.addTextfield(inputs[i]).setPosition((app.width / 2) - 100, 30 + (i * 70)).setSize(200, 40)
					.setAutoClear(true);
		}
		
		sc1logincontrol = new Sc1LoginControl();
		
		
		
		
	}
	
	public void drawScreen() {
		//app.image(img1, 0, 0);

		drawButton();
	
	}
	private void drawButton() {
		app.fill(255,0,0);
		app.rect((app.width / 2) - 40, (app.height) - 50, 80, 30);
	}
	public void getInfoForm() {
		if (app.mouseX > 112 && app.mouseX < 192 && app.mouseY > 555 && app.mouseY < 582) {
			username = cp5.get(Textfield.class, "username").getText();
			password = cp5.get(Textfield.class, "password").getText();
			confirmPassword = cp5.get(Textfield.class, "confirmPassword").getText();
			email = cp5.get(Textfield.class, "email").getText();
			
			//Esto valida que un string sea igual a otro
			if(password.equals(confirmPassword)) {
				sc1logincontrol.getInfoForm(username,password,confirmPassword,email);
			}
		}
	}

	

}
