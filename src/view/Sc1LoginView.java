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
	private PImage img1; 
	private PFont font1; 
	
	

	
	Sc1LoginControl sc1login;
	

	public Sc1LoginView(PApplet app) {
	
		sc1login = new Sc1LoginControl();
		
		
		this.app = app; 
		cp5 = new ControlP5(app);
		img1 = app.loadImage("img/login.png"); 
		inputs = new String[4];
		font1  = app.createFont("fonts/font1.ttf",18); 
		
		inputs[0] = "username";
		inputs[2] = "password";
		inputs[3] = "confirmPassword";
		inputs[1] = "email";

		for (int i = 0; i < inputs.length; i++) {
			cp5.addTextfield(inputs[i]).setPosition((app.width / 2) - 120, 328 + (i * 62))
			.setSize(210, 30)
		    .setAutoClear(true) 
		    .setColor(0)
		    .setColorActive(app.color(255,0,0,1)) // color del cuadrado externo
			.setColorBackground(app.color(255,255,255,1)) // asi lo vuelvo transparente
			.setColorForeground(app.color(255,0,0,1))  //// 
			.setFont(font1)
			.setColorCaptionLabel(app.color(255));
			
		}
		
		sc1logincontrol = new Sc1LoginControl();
		
		
		
		
	}
	
	public void drawScreen() {
		app.image(img1, 0, 0);
		drawButton();
	
	}
	private void drawButton() {
		app.fill(255,0,0,1);
		app.noStroke();
		app.rect((app.width / 2) - 40, 700, 80, 30);
	}
	public void getInfoForm() {
		if (app.mouseX > (app.width / 2) - 40 
				&& app.mouseX < (app.width / 2) - 4+80 
				&& app.mouseY > 700 && app.mouseY < 700+30) {
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
